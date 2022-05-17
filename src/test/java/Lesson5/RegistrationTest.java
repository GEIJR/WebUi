package Lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationTest extends DiaryAbstractTest {


    @Test

    void registrationNegative() throws InterruptedException {
        getDriver().get("https://diary.ru/");

        WebElement webElement1 = getDriver().findElement(By.cssSelector("span.i-new-user"));
        webElement1.click();

        Assertions.assertDoesNotThrow(() -> getDriver().navigate().to("https://diary.ru/user/registration"), "Страница не найдена");

        WebElement webElement2 = getDriver().findElement(By.name("SignupForm[username]"));
        webElement2.click();
        webElement2.sendKeys("плJтн12");
        Thread.sleep(1000);

        WebElement webElement3 = getDriver().findElement(By.name("SignupForm[password]"));
        webElement3.click();
        webElement3.sendKeys("ребус%");
        Thread.sleep(1000);

        WebElement webElement4 = getDriver().findElement(By.name("login-button"));
        webElement4.click();
        Thread.sleep(2000);

    }

    @Test
    void registrationPositive() throws InterruptedException {
        getDriver().get("https://diary.ru/");

        WebElement webElement1 = getDriver().findElement(By.cssSelector("span.i-new-user"));
        webElement1.click();

        Assertions.assertDoesNotThrow(() -> getDriver().navigate().to("https://diary.ru/user/registration"), "Страница не найдена");

        WebElement webElement2 = getDriver().findElement(By.name("SignupForm[username]"));
        webElement2.click();
        webElement2.sendKeys("Юла32");
        Thread.sleep(1000);

        WebElement webElement3 = getDriver().findElement(By.name("SignupForm[password]"));
        webElement3.click();
        webElement3.sendKeys("241037");
        Thread.sleep(1000);

        WebElement webElement4 = getDriver().findElement(By.name("SignupForm[email]"));
        webElement4.click();
        webElement4.sendKeys("nadegda_grishina@mail.ru");
        Thread.sleep(1000);

        WebElement webElement5 = getDriver().findElement(By.id("chk_box_user_confirm"));
        webElement5.click();
        Thread.sleep(2000);

        WebElement webElement6 = getDriver().findElement(By.name("login-button"));
        webElement6.click();

        Thread.sleep(2000);

    }

}