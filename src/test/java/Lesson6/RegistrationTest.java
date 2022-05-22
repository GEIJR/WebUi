package Lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegistrationTest extends DiaryAbstractTest{
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
