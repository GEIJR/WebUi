package Lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PremiumLingua extends LinguaAbstractPage{

    @FindBy(xpath = "//div[@class = 'll-leokit__site-menu__premium-status']")
    private WebElement premium;

    @FindBy(xpath = "//div[@class='ll-premium__card ll-premium__card__m-year']/div[7]/button")
    private WebElement option;

    @FindBy(xpath = "//div[@class= 'll-leokit__payment__close-button-pc']")
    private WebElement exit;

    public  PremiumLingua(WebDriver driver){
        super(driver);
    }
    public PremiumLingua clickPremium(){
        premium.click();
        return this;
    }
    public PremiumLingua clickOption(){
        option.click();
        return this;
    }
    public PremiumLingua clickExit(){
        exit.click();
        return this;
    }
}
