package Lesson7;

import Lesson6.*;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class LinguaTest7 extends LinguaAbstractTest7 {


    @Test
    void GiftTest(){
        GiftLingua giftLingua = new GiftLingua(getDriver());

        giftLingua
                .clickGifts()
                .clickOption()
                .Postcard();
        giftLingua.clickExit();
        Assertions.assertEquals("https://lingualeo.com/ru/gifts", getDriver().getCurrentUrl());

    }
    @Test
    void Dictionary(){
        DictionaryLingua dictionaryLingua = new DictionaryLingua(getDriver());
        dictionaryLingua
                .clickDictionary()
                .clickChoice()
                .clickAdd()
                .clickBack();
        Assertions.assertEquals("https://lingualeo.com/ru/dashboard", getDriver().getCurrentUrl());
    }
    @Test
    void Premium(){
        PremiumLingua premiumLingua = new PremiumLingua(getDriver());
        premiumLingua
                .clickPremium()
                .clickOption()
                .clickExit();


        Assertions.assertEquals("https://lingualeo.com/ru/premium", getDriver().getCurrentUrl());
    }
    @Test
    void testFalse() throws IOException {
        File file =MyUtils.makeScreenshot(getDriver(), "failure-Lesson7.LinguaTest7.testFalse" + System.currentTimeMillis() + ".png");
        saveScreenShot(Files.readAllBytes(file.toPath()));
        Assertions.assertTrue(true);
    }
    @Step
    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenShot(byte[] screenShot){
        return screenShot;
    }

    @Test
    void Jungle(){
        JungleLingua jungleLingua = new JungleLingua(getDriver());
        jungleLingua
                .clickJungle()
                .clickOption()
                .clickBook()
                .clickBack();
        Assertions.assertEquals("https://lingualeo.com/ru/jungle/books/books", getDriver().getCurrentUrl());
    }
}
