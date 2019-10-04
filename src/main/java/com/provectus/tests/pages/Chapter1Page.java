package com.provectus.tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Vova Vernus on 03.10.2019.
 */
public class Chapter1Page extends BasePage {

    private final String HOME_PAGE_LINK_XPATH = "//a[text() = 'Home Page']";
    private final String ASSERT_TEXT_ON_THE_PAGE_XPATH = "//div[@id = 'divontheleft' and text() = 'Assert that this text is on the page']";
    private final String UNIQUE_TEXT_ON_CHAPTER1_PAGE_XPATH = "//p[text()[contains(., 'If you have arrived here then you have installed Selenium IDE and are ready to start recording your first test.')]]";

    @FindBy(xpath = HOME_PAGE_LINK_XPATH)
    private WebElement homePageLink;

    @FindBy(xpath = ASSERT_TEXT_ON_THE_PAGE_XPATH)
    private WebElement assertTextOnThePage;

    @FindBy(xpath = UNIQUE_TEXT_ON_CHAPTER1_PAGE_XPATH)
    private WebElement uniqueTextOnChapter1Page;

    public Chapter1Page(WebDriver driver) {
        super(driver);
    }

    public void clickHomePageLink() {
        homePageLink.click();
    }

    public boolean assertTextOnThePageIsDisplayed(){
        return assertTextOnThePage.isDisplayed();
    }

    public boolean isDisplayed(){
        return uniqueTextOnChapter1Page.isDisplayed();
    }




}
