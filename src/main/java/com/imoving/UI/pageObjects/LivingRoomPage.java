package com.imoving.UI.pageObjects;

import com.imoving.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LivingRoomPage {


    public LivingRoomPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@class='13']//a[@class='btn btn-blue'][normalize-space()='Add to Inventory']")
    public WebElement AddToInventoryButtonOnSofa;
    @FindBy(xpath = "//div[@class='12']//a[@class='btn btn-blue'][normalize-space()='Add to Inventory']")
    public WebElement AddToInventoryButtonOnTV;
    @FindBy(xpath = "//button[@class='saveButton btn btn-blue']")
    public WebElement saveAndGoToTheNextButtonOnLivinfRoom;
    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[1]/div/div/figure/img")
    public WebElement imageSofa;
    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[2]/div/div/figure/img")
    public WebElement imageTV;
}
