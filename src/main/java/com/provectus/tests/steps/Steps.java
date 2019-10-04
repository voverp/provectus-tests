package com.provectus.tests.steps;

import com.provectus.tests.pages.Chapter1Page;
import com.provectus.tests.pages.HomePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.SkipException;

import static org.testng.Assert.assertTrue;

/**
 * Created by Vova Vernus on 04.10.2019.
 */
public class Steps {

    private HomePage homePage;
    private Chapter1Page chapter1Page;
    private WebDriver webDriver;

    public Steps(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.homePage = new HomePage(webDriver);
        this.chapter1Page = new Chapter1Page(webDriver);
    }

    @Step("Open Home page by {url}")
    public void openHomePageByUrl(String url){
        webDriver.get(url);
        homePage.isDisplayed();
    }

    @Step("Open Chapter1 page")
    public void openChapter1Page(){
        homePage.clickChapter1Link();
        chapter1Page.isDisplayed();
    }

    @Step("Verify that assert text on the page is displayed")
    public void verifyAssertTextOnThePageIsDisplayed(){
        assertTrue(chapter1Page.assertTextOnThePageIsDisplayed(), "'Assert that this text is on the page' is not displayed");
    }

    @Step("Open Home page")
    public void openHomePage(){
        chapter1Page.clickHomePageLink();
        homePage.isDisplayed();
    }

}
