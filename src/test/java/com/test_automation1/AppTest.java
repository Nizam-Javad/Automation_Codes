package com.test_automation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        // ChromeOptions chromeOptions = new ChromeOptions();
        try {
            WebDriverManager.chromedriver().setup();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        ;
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.quit();
    }
}
