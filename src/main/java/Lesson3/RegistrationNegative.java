package Lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class RegistrationNegative {
        public static void main(String[] args) {
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--incognito");
                options.addArguments("start-maximized");

                WebDriver driver = new ChromeDriver(options);
                driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                driver.get("https://diary.ru");

                WebElement webElement1 = driver.findElement(By.cssSelector("span.i-new-user"));
                webElement1.click();

                WebElement webElement2 = driver.findElement(By.name("SignupForm[username]"));
                webElement2.click();
                webElement2.sendKeys("плJтн12");

                WebElement webElement3 = driver.findElement(By.name("SignupForm[password]"));
                webElement3.click();
                webElement3.sendKeys("ребус%");

                WebElement webElement4 = driver.findElement(By.name("login-button"));
                webElement4.click();
               //driver.quit();

        }
        }
