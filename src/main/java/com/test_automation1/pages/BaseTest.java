package com.test_automation1.pages;

import java.io.FileInputStream;
import java.time.Duration;
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;
//import java.util.concurrent.TimeUnit;
import java.util.Properties;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

    public static WebDriver driver;
    public static Properties properties = new Properties();

    public BaseTest() {
        try {
            FileInputStream fis = new FileInputStream(
                    "D:\\Users\\MNR\\Test\\Test_Automation1\\test_automation1\\src\\main\\java\\resources\\config.properties");
            properties.load(fis);
            System.out.println(properties.getProperty("browser"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // public static Logger logger = LogManager.getLogger(DriverManager.class);

    public static void initializeDriver() throws InterruptedException {
        // String browser = "chrome";
        String browser = properties.getProperty("browser");
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
        driver.get(properties.getProperty("url"));
    }

}
