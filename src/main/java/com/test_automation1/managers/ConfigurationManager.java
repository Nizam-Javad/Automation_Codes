package com.test_automation1.managers;

import java.io.InputStream;
import java.util.Properties;
//import java.util.logging.Logger;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

public class ConfigurationManager {

    private static final Properties properties = new Properties();;
    // private static final Logger logger =
    // LogManager.getLogger(ConfigurationManager.class);

    static {
        try (InputStream input = ConfigurationManager.class.getClassLoader().getResourceAsStream("config.properties")) {
            // logger.info("Loading data properties fileto get test data");
            properties.load(input);
        } catch (Exception e) {
            // logger.info("Unable to load the test data file");
            e.printStackTrace();
            throw new RuntimeException("Unable to load the test data file");
        }

    }

    public static String getUrl() {
        return properties.getProperty("url");
    }

    public static String getUserName() {
        return properties.getProperty("user_name");
    }

    public static String getPassword() {
        return properties.getProperty("password");
    }

    public static String getBrowser() {
        return properties.getProperty("browser");
    }

    public static String getPageLoad() {
        return properties.getProperty("pageload");
    }

    public static String getImplicitWait() {
        return properties.getProperty("implicitwait");
    }

}
