package com.provectus.tests;

import com.provectus.tests.steps.Steps;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Vova Vernus on 03.10.2019.
 */
public class BaseTest {

    protected Steps steps;
    private WebDriver driver;

    @BeforeSuite
    public void setupGeckodriver(){
        WebDriverManager.firefoxdriver().setup();
    }

    @BeforeTest
    public void initDriver(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        steps = new Steps(driver);
    }


    @AfterTest
    public void closeDriver() throws MalformedURLException {
        driver.quit();
    }

}
