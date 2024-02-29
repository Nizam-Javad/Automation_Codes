package com.test_automation1.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test_automation1.pages.BaseTest;
import com.test_automation1.pages.Login;

public class LoginTest extends Login {

    @BeforeMethod
    public void setUp() throws InterruptedException {
        BaseTest.initializeDriver();

    }

    @Test
    public void validateLoginPageTitle() {
        String Title = Login.LoginPageTitle();
        Assert.assertEquals(Title, "Swag Labs");

    }

    @AfterMethod
    public void tearDown() {
        BaseTest.driver.quit();
    }

}
