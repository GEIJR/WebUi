package Lesson6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class LinguaAbstractTest {
    static WebDriver driver;
    @BeforeAll
   static void init(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        options.setPageLoadTimeout(Duration.ofSeconds(10));

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


//    }
//
//    @BeforeEach
//    void Entrance(){
        Assertions.assertDoesNotThrow(()-> driver.navigate().to("https://lingualeo.com/ru"),
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
//    @AfterEach
//    void Exit(){
//        ExitLingua exitLingua = new ExitLingua(getDriver());
//        exitLingua
//                .ExitLingua();

//        Assertions.assertEquals("https://lingualeo.com/ru", getDriver().getCurrentUrl());

   // }

    @AfterAll
    static void close(){
        if(driver !=null) driver.quit();

    }
    public static WebDriver getDriver(){

        return driver;
    }
}
