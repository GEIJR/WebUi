package Lesson7;

import Lesson6.EntranceLingua;
import Lesson6.ExitLingua;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.time.Duration;
import java.util.List;

public class LinguaAbstractTest7 {
    static EventFiringWebDriver eventDriver;
    @BeforeAll
    static void init(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        options.setPageLoadTimeout(Duration.ofSeconds(10));

        eventDriver  = new EventFiringWebDriver(new ChromeDriver(options));
        eventDriver.register(new MyWebDriverEventListener());
        eventDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        Assertions.assertDoesNotThrow(()-> eventDriver.navigate().to("https://lingualeo.com/ru"),
                "Страница не доступна");
        EntranceLingua entranceLingua = new EntranceLingua(getDriver());
        entranceLingua
                .clickEntrance()
                .clickAccount()
                .clickMail()
                .clickMail()
                .clickPassword()
                .clickEnter();
    }
    @AfterEach
    public void checkBrowser(){
        List<LogEntry> allLogRows = getDriver().manage().logs().get(LogType.BROWSER).getAll();
        if(!allLogRows.isEmpty()){

            if (allLogRows.size() > 0){
                allLogRows.forEach(logEntry -> {
                    System.out.println(logEntry.getMessage());
                });
            }
        }
    }


    @AfterAll
    static void close(){
        ExitLingua exitLingua = new ExitLingua(getDriver());
        exitLingua
                .ExitLingua();

        Assertions.assertEquals("https://lingualeo.com/ru", getDriver().getCurrentUrl());

        if(eventDriver !=null) eventDriver.quit();

    }
    public static WebDriver getDriver(){
        return eventDriver;
    }
}
