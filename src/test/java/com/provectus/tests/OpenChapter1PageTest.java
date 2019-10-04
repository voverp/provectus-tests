package com.provectus.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

/**
 * Created by Vova Vernus on 03.10.2019.
 */
public class OpenChapter1PageTest extends BaseTest {

    @Test
    public void verifyCharacter1PageIsOpen(){
        steps.openHomePageByUrl("http://book.theautomatedtester.co.uk/");
        steps.openChapter1Page();
        steps.verifyAssertTextOnThePageIsDisplayed();
    }

    @AfterTest
    public void openHomePage(){
        steps.openHomePage();
    }

}
