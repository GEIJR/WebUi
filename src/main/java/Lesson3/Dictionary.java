package Lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Dictionary {
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
        //Добавление слов в словарь
        WebElement webElement6 = driver.findElement(By.xpath("//*[@id='topitem-dictionary']/a/span/span[2]"));
        webElement6.click();

//добавляем слова на тему мебель
        WebElement webElement7 = driver.findElement(By.xpath("//div[@class ='ll-application__content-inner ll-application__content-inner__m-with-sidebar']//ul/li[2]/div"));
        webElement7.click();

        WebElement webElement8 = driver.findElement(By.xpath("//div[@id='filter-header']/div[1]/div[1]/div[1]/label"));
        webElement8.click();


        //driver.quit();
    }
}
