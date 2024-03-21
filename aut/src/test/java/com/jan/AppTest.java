package com.jan;

import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void testApp() {
        WebDriverManager driver = WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
}
