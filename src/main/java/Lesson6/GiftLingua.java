package Lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class GiftLingua extends  LinguaAbstractPage{
    @FindBy(css = ".ll-leokit__site-menu__gifts")
    private WebElement gifts;

    @FindBy(xpath = "//div[@ class='ll-gifts__start-gifts-card ll-gifts__start-gifts-card__m-cardid-0']")
    private WebElement option;

    @FindBy(xpath = "//*[@id='app']/div/div[2]/div/div/div/div[2]/div[2]/div[1]/div")
    private WebElement background;

    @FindBy(xpath = "//input[@class='ll-leokit__input ll-leokit__input__m-empty editable']")
    private WebElement sender;

    @FindBy(xpath = "//textarea[@class='ll-leokit__multiline-input__text-area editable']")
    private WebElement text;

    @FindBy(xpath = "//div[@class='ll-gifts__select-form-button']")
    private WebElement payment;

    @FindBy(xpath = "//div[@class='ll-leokit__payment__close-button-pc']")
    private WebElement exit;

    public GiftLingua(WebDriver driver){
        super(driver);
    }
    public GiftLingua clickGifts(){
        gifts.click();
        return this;
    }
    public GiftLingua clickOption(){
        option.click();
        return this;
    }
    public GiftLingua clickExit(){
        exit.click();
        return this;
    }
     void Postcard(){
        Actions postcard = new Actions(getDriver());
        postcard.click(background)
                .click(sender)
                .sendKeys(sender,"Гришина Надежда")
                .click(text)
                .sendKeys(text, "С ДНЕМ РОЖДЕНИЯ!!!")
                .click(payment)
                .build()
                .perform();
    }



}
