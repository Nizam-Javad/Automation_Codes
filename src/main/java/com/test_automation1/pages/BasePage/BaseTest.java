package com.test_automation1.pages.BasePage;

import java.io.FileInputStream;
import java.time.Duration;
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;
//import java.util.concurrent.TimeUnit;
import java.util.Properties;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

    public static WebDriver driver;
    public static Properties properties = new Properties();
   // private static Logger log;
    public static ExtentSparkReporter extentSparkReporter;
    public static ExtentReporter extentReporter;
    public static ExtentTest test;

    public BaseTest() {
        try {
           FileInputStream fis = new FileInputStream(
                    "D:\\Users\\MNR\\Test\\Test_Automation1\\test_automation1\\src\\main\\java\\resources\\config.properties");
            properties.load(fis);

            /*FileInputStream fis = new FileInputStream(
                    "src/main/java/resources/config.properties");
            properties.load(fis);*/
            //D:\Users\MNR\Test\Test_Automation1\test_automation1\src\main\java\resources\config.properties

            //src/main/java/resources/config.properties

            System.out.println(properties.getProperty("browser"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // public static Logger logger = LogManager.getLogger(DriverManager.class);
    public static  void initializeReporter(){

    }

    public static void initializeDriver() throws InterruptedException {
        // String browser = "chrome";
        //log = LogManager.getLogger(log.getClass().toString());
        //log.info("Getting the browser from the Config File");
        String browser = properties.getProperty("browser");
        // logger.info("Initializing the browser" + browser);
       // log.info("Initialiing the browser"+browser);
        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException();
        }
        // driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(ConfigurationManager.getPageLoad()));
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        //log.info("Maximizing the wimdow");
        Thread.sleep(1000);
       // log.info("Fetching the URL from COnfig FIle");
        driver.get(properties.getProperty("url"));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

}
