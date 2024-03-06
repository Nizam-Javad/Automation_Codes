package com.test_automation1.pages.Pages;

import java.util.Properties;

//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test_automation1.pages.BasePage.BaseTest;

public class Login extends BaseTest {

    Properties Prop = new Properties();
    @FindBy(xpath = "//div[@class='login_logo' and text()='Swag Labs']")
    WebElement pageTitle;

    @FindBy(xpath = "//input[@id='user-name']")
    WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
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

    /*
     * public HomePage enterCredentials() {
     * userName.sendKeys(Prop.getProperty("username"));
     * password.sendKeys(Prop.getProperty("password"));
     * loginBtn.click();
     * return HomePage;
     * 
     * }
     */
    public HomePage login() {
        userName.sendKeys("standard_user");

        password.sendKeys("secret_sauce");
        // password.sendKeys(Prop.getProperty("password"));
        loginBtn.click();

        return new HomePage();
    }

}
