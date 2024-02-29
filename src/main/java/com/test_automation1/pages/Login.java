package com.test_automation1.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseTest {
    @FindBy(xpath = "//div[@class='login_logo' and text()='Swag Labs']")
    WebElement pageTitle;

    @FindBy(id = "//input[@id='user-name']")
    WebElement userName;

    @FindBy(id = "//input[@id='password']")
    WebElement password;

    @FindBy(id = "login-button")
    WebElement loginBtn;

    public Login() {
        PageFactory.initElements(driver, this);
    }

    public static String LoginPageTitle() {
        System.out.println(driver.getTitle());
        return driver.getTitle();
    }

}
