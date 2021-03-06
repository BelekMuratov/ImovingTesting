package com.imoving.UI.pageObjects;

import com.imoving.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BoxCalculator {
    public BoxCalculator(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/h2")
    public WebElement BoxCalculatorText;
    @FindBy(xpath = "//a[normalize-space()='Add and Continue']")
    public WebElement addAndContinueButton;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div/div/a[2]")
    public WebElement clearBoxesButton;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div/div/a[1]")
    public WebElement BackToInventoryButton;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div/div/a[3]")
    public WebElement reCalculateButton;

}
