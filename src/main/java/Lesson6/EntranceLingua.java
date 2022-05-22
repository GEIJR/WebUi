package Lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EntranceLingua extends LinguaAbstractPage{
    @FindBy(css = ".ll-leokit__site-menu__auth-wrapper")
    private WebElement entrance;

    @FindBy(css = ".ll-leokit__button.ll-ModalAuthAlt__switch")
    private WebElement account;

    @FindBy(css = "[placeholder=E-mail]")
    private WebElement mail;

    @FindBy(css = "[type=password]")
    private WebElement password;

    @FindBy(css = ".ll-ModalAuthAlt__submit")
    private WebElement enter;

    public EntranceLingua (WebDriver driver){super(driver);}

    public EntranceLingua clickEntrance(){
        entrance.click();
        return this;
    }
    public EntranceLingua clickAccount(){
        account.click();
        return this;
    }
    public EntranceLingua clickMail(){
        mail.click();
        mail.clear();
        mail.sendKeys("ng20101980@yandex.ru");
        return this;
    }
    public EntranceLingua clickPassword(){
        password.click();
        password.sendKeys("yfl.if2010");
        return this;
    }

    public EntranceLingua clickEnter(){
        enter.click();
        return this;
    }




}
