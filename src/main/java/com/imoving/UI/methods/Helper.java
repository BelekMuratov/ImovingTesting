package com.imoving.UI.methods;

import com.imoving.UI.log4JDemo;
import com.imoving.UI.utils.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Helper {
    private static Logger logger = LogManager.getLogger(log4JDemo.class);

    public static void click(WebElement element){
        logger.info("trying to click "+ element);
        try {
            waitElementToBeDisplayed(element);
            waitElementToBeClickable(element);
            element.click();
            logger.info(element + "clicked");
        }catch (ElementClickInterceptedException e){
            logger.warn("Element is not clickable but I clicked with JS click");
            jsclick(element);
        }
    }
    public static void waitElementToBeDisplayed(WebElement element){
        logger.debug("Waiting element to be displayed " + element);
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOf(element));
    }
    public static void waitElementToBeClickable(WebElement element){
        logger.info("Waiting element to be Clickable");
        new WebDriverWait((Driver.getDriver()),Duration.ofSeconds(10)).
                until(ExpectedConditions.elementToBeClickable(element));
    }
    public static void sendkeys(WebElement element, String value){
        element.sendKeys(value);
    }
    public static void pause (Integer milliseconds){
        logger.info("pausing the system");
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
     public static String getTextValue(WebElement element){
        waitElementToBeDisplayed(element);
        return element.getText();
     }
     public static void jsclick(WebElement element){
        waitElementToBeDisplayed(element);
        waitElementToBeClickable(element);
         JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
         js.executeScript("arguments[0].click();",element);
     }
     public static void navigateToElement(WebElement element){
         Actions actions = new Actions(Driver.getDriver());
         actions.moveToElement(element).perform();
     }
     public static void multipleClick(WebElement element, int howManyTimes){
     int counter = howManyTimes;
     waitElementToBeDisplayed(element);
     waitElementToBeClickable(element);
     while (counter > 0){
         element.click();
         counter--;
     }
     }
     public static void sendkeys(WebElement element, Keys button){
        element.sendKeys(button);
     }

}
