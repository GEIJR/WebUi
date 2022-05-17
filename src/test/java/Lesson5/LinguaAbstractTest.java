package Lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public abstract class LinguaAbstractTest {
    static WebDriver driver;

    @BeforeAll
    static void init(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }
    @BeforeEach
    void getPage() throws InterruptedException{
             Assertions.assertDoesNotThrow(()-> driver.navigate().to("https://lingualeo.com/ru"),
                "Страница не доступна");
        WebElement webElement1 = getDriver().findElement(By.cssSelector(".ll-leokit__site-menu__auth-wrapper"));
        webElement1.click();
        WebElement webElement2 = getDriver().findElement(By.cssSelector(".ll-leokit__button.ll-ModalAuthAlt__switch"));
        webElement2.click();
        //Очистка текстового поля
        WebElement webElement3 = getDriver().findElement(By.cssSelector("[placeholder=E-mail]"));
        webElement3.clear();

        Thread.sleep(1000);

        Actions search = new Actions(getDriver());
        search.click(getDriver().findElement(By.cssSelector("[placeholder=E-mail]")))
                .sendKeys("ng20101980@yandex.ru")
                .pause(1000)
                .click(getDriver().findElement(By.cssSelector("[type=password]")))
                .sendKeys("yfl.if2010")
                .pause(1000)
                .click(getDriver().findElement(By.cssSelector(".ll-ModalAuthAlt__submit")))
                .build()
                .perform();

    }
    @AfterEach
    void ExitPage() throws InterruptedException{
        WebElement webElement9 = getDriver().findElement(By.xpath("//div[@class='ll-leokit__site-menu__user-menu-wrapper']"));
        Thread.sleep(1000);
        Actions actionsProvideMove = new Actions(getDriver());
        actionsProvideMove.moveToElement(webElement9).build().perform();
        Thread.sleep(1000);

        WebElement webElement10 = getDriver().findElement(By.xpath("//ul//li[9]//span[@class='ll-leokit__user-menu-item__content__title']"));
        webElement10.click();
        Thread.sleep(1000);
        Assertions.assertDoesNotThrow(()-> driver.navigate().to("https://lingualeo.com/ru"),"Страница не доступна");

    }


    @AfterAll
    static void close(){
//        driver.quit();

    }

    public static WebDriver getDriver(){
        return driver;
    }
}
