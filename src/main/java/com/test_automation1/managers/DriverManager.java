package com.test_automation1.managers;

import java.time.Duration;
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;
//import java.util.concurrent.TimeUnit;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

    public static WebDriver driver;
    // public static Logger logger = LogManager.getLogger(DriverManager.class);

    public static void initializeDriver() throws InterruptedException {
        String browser = "chrome";
        // ConfigurationManager.getBrowser();
        // logger.info("Initializing the browser" + browser);
        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "edge":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            default:
                throw new IllegalArgumentException();
        }
        // driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(ConfigurationManager.getPageLoad()));
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get("https://www.saucedemo.com/");
    }

}
