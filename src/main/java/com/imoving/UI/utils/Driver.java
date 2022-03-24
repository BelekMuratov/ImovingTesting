package com.imoving.UI.utils;

import com.imoving.UI.dataProviders.ConfigReader;
import org.openqa.selenium.WebDriver;

public class Driver {

    private Driver(){
    // single pattern
    }

   public static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver==null){
            switch (ConfigReader.getProperty("browser").toLowerCase()){
                default:
                    driver = ChromeWebDriver.loadChromedriver();
                    break;
                case "firefox":
                    driver = FirefoxWebDriver.loadFirefoxDriver();
                    break;
                case "safari":
                    driver = SafariWebDriver.loadSafariDriver();
                    break;
            }
        }
        return driver;
    }
    public static void closeDriver(){
        try{
           if (driver != null){
               driver.close();
               driver.quit();
               driver = null;
           }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
