package com.test_automation1.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test_automation1.pages.BasePage.BaseTest;
import com.test_automation1.pages.Pages.Login;
import com.test_automation1.pages.Pages.*;

public class LoginTest extends BaseTest {
    Login login = new Login();;
    // HomePage homePage;

    public LoginTest() {
        super();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        initializeDriver();

    }

    @Test(priority = 1)
    public void validateLoginPageTitle() {
        String Title = Login.LoginPageTitle();
        Assert.assertEquals(Title, "Swag Labs");

    }

    @Test(priority = 2)
    public void validateLogin() {
        login = new Login();
        login.login();

    }

    @AfterMethod
    public void tearDown() {
        // BaseTest.quit();
        BaseTest.driver.quit();
    }

}
