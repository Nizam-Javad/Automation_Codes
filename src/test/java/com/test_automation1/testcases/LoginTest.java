package com.test_automation1.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test_automation1.managers.DriverManager;
import com.test_automation1.pages.Login;

public class LoginTest extends Login {

    @BeforeMethod
    public void setUp() throws InterruptedException {
        DriverManager.initializeDriver();

    }

    @Test
    public void validateLoginPageTitle() {
        String Title = Login.LoginPageTitle();
        Assert.assertEquals(Title, "Swag Labs");

    }

    @AfterMethod
    public void tearDown() {
        DriverManager.driver.quit();
    }

}
