package com.test_automation1.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test_automation1.pages.BasePage.BaseTest;
import com.test_automation1.pages.Pages.Login;
import com.test_automation1.pages.Pages.HomePage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePageTest extends BaseTest {

    WebDriver driver;
    Login login;
    HomePage homepage ;
            //= new HomePage();

    public HomePageTest() {
        super();
        // login = new Login();

    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        initializeDriver();
        String PT = Login.LoginPageTitle();
        System.out.println("PT is " + PT);
        login = new Login();
        homepage=login.login();

    }

    @Test
    public void verifyItemDisplayedTest() throws Exception {
        // homepage.verifyCartLinkIsDisplayed();
        System.out.println("Came Inside Test of Home Page :) ");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        Assert.assertTrue(homepage.verifyCartLinkIsDisplayed());

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();

    }
}