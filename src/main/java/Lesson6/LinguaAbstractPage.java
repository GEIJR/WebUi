package Lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class LinguaAbstractPage  {
    private WebDriver driver;
    public LinguaAbstractPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    protected WebDriver getDriver(){
        return this.driver;
    }
}
