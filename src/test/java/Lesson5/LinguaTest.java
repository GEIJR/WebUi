package Lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LinguaTest extends LinguaAbstractTest{



    @Test
    void Gift() throws InterruptedException {

    getDriver().get("https://lingualeo.com/ru/dashboard");


    Assertions.assertDoesNotThrow(() -> getDriver().navigate().to("https://lingualeo.com/ru/dashboard"),
            "Страница не доступна");

// подарок

    WebElement webElement6 = getDriver().findElement(By.cssSelector(".ll-leokit__site-menu__gifts"));
    webElement6.click();
    Thread.sleep(1000);

    WebElement webElement7 = getDriver().findElement(By.xpath("//div[@ class='ll-gifts__start-gifts-card ll-gifts__start-gifts-card__m-cardid-0']"));
    webElement7.click();
    Thread.sleep(1000);

//открытка и оплата
    getDriver().navigate();
    Actions search1 = new Actions(getDriver());
    search1.click(getDriver().findElement(By.xpath("//*[@id='app']/div/div[2]/div/div/div/div[2]/div[2]/div[1]/div")))
            .pause(1000)
            .click(getDriver().findElement(By.xpath("//input[@class='ll-leokit__input ll-leokit__input__m-empty editable']")))
            .sendKeys("Гришина Надежда")
            .pause(1000)
            .click(getDriver().findElement(By.xpath("//textarea[@class='ll-leokit__multiline-input__text-area editable']")))
            .sendKeys("С ДНЕМ РОЖДЕНИЯ!!!")
            .pause(1000)
            .click(getDriver().findElement(By.xpath("//div[@class='ll-gifts__select-form-button']")))
            .pause(1000)
            .build()
            .perform();
    WebElement webElement8 = getDriver().findElement(By.xpath("//div[@class='ll-leokit__payment__close-button-pc']"));
    webElement8.click();

    Thread.sleep(2000);

}

    @Test
    void Dictionary() throws InterruptedException {
        getDriver().get("https://lingualeo.com/ru/dashboard");

        Assertions.assertDoesNotThrow(() -> getDriver().navigate().to("https://lingualeo.com/ru/dashboard"),
                "Страница не доступна");

        //Добавление слов в словарь
        WebElement webElement6 = getDriver().findElement(By.xpath("//*[@id='topitem-dictionary']/a/span/span[2]"));
        webElement6.click();
        Thread.sleep(1000);

//добавляем слова на тему мебель
        WebElement webElement7 = getDriver().findElement(By.xpath("//div[@class ='ll-application__content-inner ll-application__content-inner__m-with-sidebar']//ul/li[2]/div"));
        webElement7.click();
        Thread.sleep(1000);

        WebElement webElement8 = getDriver().findElement(By.xpath("//div[@id='filter-header']/div[1]/div[1]/div[1]/label"));
        webElement8.click();
        Thread.sleep(2000);

    }
    @Test
    void Premium() throws InterruptedException{
    getDriver().get("https://lingualeo.com/ru/dashboard");

    Assertions.assertDoesNotThrow(() -> getDriver().navigate().to("https://lingualeo.com/ru/dashboard"),
            "Страница не доступна");
    //Покупка премиума
    WebElement webElement1 = getDriver().findElement(By.xpath("//div[@class = 'll-leokit__site-menu__premium-status']"));
    webElement1.click();
    Thread.sleep(1000);
    WebElement webElement2 = getDriver().findElement(By.xpath("//div[@class='ll-premium__card ll-premium__card__m-year']/div[7]/button"));
    webElement2.click();
    Thread.sleep(1000);
    WebElement webElement3 = getDriver().findElement(By.xpath("//div[@class= 'll-leokit__payment__close-button-pc']"));
    webElement3.click();
    Thread.sleep(1000);


}
    @Test
    void Jungle () throws InterruptedException{
    getDriver().get("https://lingualeo.com/ru/dashboard");

    WebElement webElement1 = getDriver().findElement(By.xpath("//div[@class = 'll-leokit__site-menu']/ul/li[2]"));
    webElement1.click();
        Thread.sleep(1000);
    WebElement webElement2 =getDriver().findElement(By.xpath("//div[@class = 'll-jungle-main__block']/div[4]//ul/li[1]"));
    webElement2.click();
        Thread.sleep(1000);
    WebElement webElement3 = getDriver().findElement(By.xpath("//div[@class = 'll-jungle-all__block']/div[3]//li[1]"));
    webElement3.click();
        Thread.sleep(1000);
    WebElement webElement4 = getDriver().findElement(By.xpath("//span[@class ='ll-jungle-content__link ll-jungle-content__link__m-back']"));
    webElement4.click();
        Thread.sleep(1000);

    }
}

