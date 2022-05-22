package Lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinguaTest extends LinguaAbstractTest{

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
    void Jungle(){
        JungleLingua jungleLingua= new JungleLingua(getDriver());
        jungleLingua
                .clickJungle()
                .clickOption()
                .clickBook()
                .clickBack();
        Assertions.assertEquals("https://lingualeo.com/ru/jungle/books/books", getDriver().getCurrentUrl());
    }
}
