package Lesson6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public abstract class DiaryAbstractTest {

    static WebDriver driver;

    @BeforeAll
    static void init(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        options.setPageLoadTimeout(Duration.ofSeconds(10));

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }
    @BeforeEach
    void goTo(){

        Assertions.assertDoesNotThrow(()-> driver.navigate().to("https://diary.ru"),
                "Страница не доступна");
        Assertions.assertTrue(true);
    }
    @AfterAll
    static void close(){
        if(driver !=null) driver.quit();

    }
    public static WebDriver getDriver(){

        return driver;
    }
}

