package Lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Gift {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://lingualeo.com/ru");
 //авторизация
        WebElement webElement1 = driver.findElement(By.cssSelector(".ll-leokit__site-menu__auth-wrapper"));
        webElement1.click();

        WebElement webElement2 = driver.findElement(By.cssSelector(".ll-leokit__button.ll-ModalAuthAlt__switch"));
        webElement2.click();
        WebElement webElement3 = driver.findElement(By.cssSelector("[placeholder=E-mail]"));
        webElement3.click();
        webElement3.sendKeys("ng20101980@yandex.ru");

        WebElement webElement4 = driver.findElement(By.cssSelector("[type=password]"));
        webElement4.click();
        webElement4.sendKeys("yfl.if2010");

        WebElement webElement5 = driver.findElement(By.cssSelector(".ll-ModalAuthAlt__submit"));
        webElement5.click();
 // подарок
        WebElement webElement6= driver.findElement(By.cssSelector(".ll-leokit__site-menu__gifts"));
        webElement6.click();

        WebElement webElement7= driver.findElement(By.xpath("//div[@ class='ll-gifts__start-gifts-card ll-gifts__start-gifts-card__m-cardid-0']"));
        webElement7.click();
//выбор открытки
        WebElement webElement8= driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div/div/div/div[2]/div[2]/div[1]/div"));
        webElement8.click();
// заполнение формф открытки
        WebElement webElement9= driver.findElement(By.xpath("//input[@class='ll-leokit__input ll-leokit__input__m-empty editable']"));
        webElement9.click();
        webElement9.sendKeys("Гришина Надежда");

        WebElement webElement10= driver.findElement(By.xpath("//textarea[@class='ll-leokit__multiline-input__text-area editable']"));
        webElement10.click();
        webElement10.sendKeys("С ДНЕМ РОЖДЕНИЯ!!!");


//оплата
        WebElement webElement13= driver.findElement(By.xpath("//div[@class='ll-gifts__select-form-button']"));
        webElement13.click();

        //driver.quit();
    }
}
