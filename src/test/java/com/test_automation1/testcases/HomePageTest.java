package com.test_automation1.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Property;
import org.apache.logging.log4j.spi.PropertyComponent;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test_automation1.pages.BasePage.BaseTest;
import com.test_automation1.pages.Pages.Login;
import com.test_automation1.pages.Pages.HomePage;
import com.test_automation1.pages.Pages.*;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePageTest extends BaseTest {

    // WebDriver driver;
    // Login login = new Login();;
    HomePage homepage = new HomePage();
    private Logger log;

    public HomePageTest() {
        super();
        // login = new Login();

    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        log = LogManager.getLogger(this.getClass().toString());

        log.info("Initializing browser");
        initializeDriver();
        String PT = Login.LoginPageTitle();
        log.info("Verifying the Title");
        System.out.println("PT is " + PT);
        System.out.println("Hi");

        Login login = new Login();
        // homepage= new HomePage();
        homepage = login.enterCredentials();

    }

    @Test
    public void clickOnHamburgerTest() throws Exception {
        // homepage.verifyCartLinkIsDisplayed();
        System.out.println("Came Inside Test of Home Page :) ");
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Assert.assertTrue(homepage.verifyCartLinkIsDisplayed());
        // homepage.clickOnAddToCart();
        // homepage = new HomePage();

        homepage.clickOnHamburger();
        homepage.clickOnCrossIcon();

    }

    @Test
    public void selectDropDownvalueTest() throws InterruptedException {
        homepage.selectDropDownvalue();
        Thread.sleep(1000);

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();

    }
}