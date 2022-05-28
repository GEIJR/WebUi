package Lesson7;


import Lesson6.*;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class RegistrationTest7 extends DiaryAbstractTest7 {
    @Test
    void testFalse() throws IOException {
        File file =MyUtils.makeScreenshot(getDriver(), "failure-Lesson7.RegistrationTest7.testFalse" + System.currentTimeMillis() + ".png");
        saveScreenShot(Files.readAllBytes(file.toPath()));
        Assertions.assertTrue(true);
    }
    @Step
    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenShot(byte[] screenShot){
        return screenShot;
    }

    @Test
    void registrationNegativeTest(){
        Registration registration = new Registration(getDriver());
        registration
                .clickRegister()
                .clickLoginNegative()
                .clickPasswordNegative()
                .clickAddNegative();
        Assertions.assertEquals("https://diary.ru/user/registration", getDriver().getCurrentUrl());
    }
    @Test
    void registrationPositiveTest(){
        Registration registration = new Registration(getDriver());
        registration
                .clickRegister()
                .clickLoginPositive()
                .clickPasswordPositive()
                .clickMailPositive()
                .clickConsentPositive()
                .clickAddPositive();
        Assertions.assertEquals("https://diary.ru/user/registration", getDriver().getCurrentUrl());
    }
}
