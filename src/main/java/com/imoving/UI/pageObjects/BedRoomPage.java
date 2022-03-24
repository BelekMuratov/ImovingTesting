package com.imoving.UI.pageObjects;

import com.imoving.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BedRoomPage {

    public BedRoomPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@class='14']//a[@class='btn btn-blue'][normalize-space()='Add to Inventory']")
    public WebElement addToInventoryDresserButton;
    @FindBy(xpath = "//div[@class='13']//a[@class='btn btn-blue'][normalize-space()='Add to Inventory']")
    public WebElement addToInventoryBedButton;
    @FindBy(xpath = "//div[@class='col-sm-9']")
    public WebElement saveAndGoToNextButton;
    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[1]/div/div/figure/img")
    public WebElement imageDresser;
    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[2]/div/div/figure/img")
    public WebElement imageBed;
}
