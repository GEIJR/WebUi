package Lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JungleLingua extends LinguaAbstractPage {
    @FindBy(xpath = "//div[@class = 'll-leokit__site-menu']/ul/li[2]")
    private WebElement jungle;

    @FindBy(xpath = "//div[@class = 'll-jungle-main__block']/div[4]//ul/li[1]")
    private WebElement option;

    @FindBy(xpath = "//div[@class = 'll-jungle-all__block']/div[3]//li[1]")
    private WebElement book;

    @FindBy(xpath = "//span[@class ='ll-jungle-content__link ll-jungle-content__link__m-back']")
    private WebElement back;

    public JungleLingua(WebDriver driver) {
        super(driver);
    }

    public JungleLingua clickJungle() {
        jungle.click();
        return this;
    }

    public JungleLingua clickOption(){
        option.click();
        return this;
    }
    public JungleLingua clickBook(){
        book.click();
        return this;
    }

    public JungleLingua clickBack(){
        back.click();
        return this;
    }
}