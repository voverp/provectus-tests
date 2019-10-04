package com.provectus.tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Vova Vernus on 03.10.2019.
 */
public class HomePage extends BasePage{

    private final String CHAPTER1_LINK_XPATH = "//a[@href = '/chapter1']";
    private final String UNIQUE_TEXT_ON_HOME_PAGE_XPATH = "//div[text()[contains(., 'Below is a list of links to the examples needed in the chapters. Click on the links below and follow the steps in the book.')]]";

    @FindBy(xpath = CHAPTER1_LINK_XPATH)
    private WebElement chapter1Link;

    @FindBy(xpath = UNIQUE_TEXT_ON_HOME_PAGE_XPATH)
    private WebElement uniqueTextOnHomePage;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickChapter1Link() {
        chapter1Link.click();
    }

    public boolean isDisplayed(){
        return uniqueTextOnHomePage.isDisplayed();
    }

}
