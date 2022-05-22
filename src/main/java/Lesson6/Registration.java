package Lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

    public class Registration extends DiaryAbstractPage{

        @FindBy(css = "span.i-new-user")
        private WebElement register;

        @FindBy(name = "SignupForm[username]")
        private WebElement login;

        @FindBy(name = "SignupForm[password]")
        private WebElement password;

        @FindBy(name = "login-button")
        private WebElement add;

        @FindBy(name = "SignupForm[email]")
        private  WebElement mail;

        @FindBy(id = "chk_box_user_confirm")
        private WebElement consent;

        public Registration(WebDriver driver){
            super(driver);
        }
        public Registration clickRegister(){
            register.click();
            return this;
        }
        public Registration clickLoginNegative(){
            login.click();
            login.sendKeys("плJтн12");
            return this;
        }
        public Registration clickPasswordNegative(){
            password.click();
            password.sendKeys("ребус%");
            return this;
        }
        public Registration clickAddNegative(){
            add.click();
            return this;
        }

        public Registration clickLoginPositive(){
            login.click();
            login.sendKeys("Юла32");
            return this;
        }

        public Registration clickPasswordPositive(){
           password.click();
           password.sendKeys("241037");
            return  this;
        }

        public Registration clickMailPositive(){
            mail.click();
            mail.sendKeys("nadegda_grishina@mail.ru");
            return this;
        }

        public Registration clickConsentPositive(){
            consent.click();
            return this;
        }

        public Registration clickAddPositive(){
            add.click();
            return this;
        }




}
