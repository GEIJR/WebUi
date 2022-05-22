package Lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ExitLingua extends LinguaAbstractPage{
    @FindBy(xpath = "//div[@class='ll-leokit__site-menu__user-menu-wrapper']")
   private WebElement profile;

    @FindBy(xpath = "//ul//li[9]//span[@class='ll-leokit__user-menu-item__content__title']")
    private WebElement exit;

    public ExitLingua(WebDriver driver){super(driver);}

    public void ExitLingua(){
        Actions actions = new Actions(getDriver());
        actions.moveToElement(profile).build().perform();
        exit.click();

    }
}
