package com.test_automation1.pages.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test_automation1.pages.BasePage.BaseTest;
//import org.testng.Assert

public class HomePage extends BaseTest {
    Login login;
    HomePage homepage = new HomePage();

    @FindBy(xpath = "//div[@class='app_logo' and text()='Swag Labs']")
    WebElement homePageTitle;

    @FindBy(xpath = "//div[@class='inventory_item_name ' and text()='Sauce Labs Backpack']")
    WebElement homePageItem;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement shoppingCartLink;

    @FindBy(xpath = "//span[@class='title' and text()='Products']")
    WebElement pageTitle;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void verifyHomePageTitle() {
        // Assert.assertEquals(homePageTitle, "Swag Labs");

    }

    public boolean verifyCartLinkIsDisplayed() {

        return pageTitle.isDisplayed();

    }

}
