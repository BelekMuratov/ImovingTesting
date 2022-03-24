package com.imoving.UI.utils;

import com.imoving.UI.methods.Helper;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class SauceLabsDemo1 {
    public static void main(String[] args) throws MalformedURLException {

        String USERNAME = "oauth-belek.muratov-ef972";
        String ACCESS_KEY = "b65c6dfc-79ff-417c-9728-980a3e1fa1c4";

        String url = "https://oauth-belek.muratov-ef972:b65c6dfc-79ff-417c-9728-980a3e1fa1c4@ondemand.eu-central-1.saucelabs.com:443/wd/hub";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", Platform.WIN10);
        capabilities.setCapability("browserName", BrowserType.EDGE);
        capabilities.setCapability("browserVersion", "latest");

        WebDriver driver = new RemoteWebDriver(new URL(url),capabilities);
        driver.get("https://www.amazon.com/");

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("iphone" + Keys.ENTER);
        Helper.pause(3000);

        List<WebElement> brands = driver.findElements(By.id("brandsRefinements"));
        for (WebElement e : brands){
            System.out.println(e.getText());
        }
    }
}
