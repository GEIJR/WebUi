package Lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DictionaryLingua extends LinguaAbstractPage{
    @FindBy(xpath = "//*[@id='topitem-dictionary']/a/span/span[2]")
    private WebElement dictionary;

    @FindBy(xpath = "//div[@class ='ll-application__content-inner ll-application__content-inner__m-with-sidebar']//ul/li[2]/div")
    private WebElement choice;

    @FindBy(xpath = "//div[@id='filter-header']/div[1]/div[1]/div[1]/label")
    private WebElement add;

    @FindBy(xpath = "//a[@class = 'll-leokit__site-logo']")
    private WebElement back;

    public DictionaryLingua(WebDriver driver){
        super(driver);
    }

    public DictionaryLingua clickDictionary(){
        dictionary.click();
        return this;
    }
    public DictionaryLingua clickChoice(){
        choice.click();
        return this;
    }
    public DictionaryLingua clickAdd(){
        add.click();
        return this;
    }
    public DictionaryLingua clickBack(){
        back.click();
        return this;
    }


}
