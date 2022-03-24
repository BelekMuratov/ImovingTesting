package com.imoving.UI.pageObjects;

import com.imoving.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {


    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[normalize-space()='Compare Quotes']")
    public WebElement compareQuotesButton;
    @FindBy(xpath ="//a[normalize-space()='Moving']")
    public WebElement movingTab;
    @FindBy(xpath = "//a[normalize-space()='Labor']")
    public WebElement laborTab;
    @FindBy (id = "houseTypeSelectList")
    public WebElement WhatAreYouMovingSelectList;
    @FindBy (id = "hp-nav-select-house")
    public WebElement moveSizeList;
    @FindBy(xpath = "//a[@class='1079']")
    public WebElement WhatAreYouMovingDropDownSelectedMenu;
    @FindBy(xpath = "//button[normalize-space()='Compare Quotes']")
    public WebElement CompareQuotesButton;
    @FindBy(xpath = "//*[@id=\"index\"]/div/main/section[1]/figure/div/div/div[1]/ul/li[1]/a")
    public WebElement movingTabButton;
    @FindBy(xpath = "//a[normalize-space()='GOT IT']")
    public WebElement GotItButtonText;
    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div")
    public WebElement GotItButton;
    @FindBy(xpath = "//*[@id=\"closeSaveModal\"]")
    public WebElement closeButton;
    @FindBy(xpath = "/html/body/div/div/div/div[1]/section[1]/div/p[1]")
    public WebElement hereYouCanSeeAllYourText;
    @FindBy(xpath = "//a[@id='nextInventoryTutorial']")
    public WebElement nextButtonOnHereYouCanSeeAllYourRoomsAndStartMoving;
    @FindBy(xpath = "//a[@id='closeTutorial']")
    public WebElement okButtonOnOnHereYouCanSeeAllYourRoomsAndStartMoving;
    @FindBy(xpath = "/html/body/div/div/div/div[1]/section[2]/div/p[1]")
    public WebElement hereYouCanSeeInventoryItemsForSelectedRoomText;
    @FindBy(id = "nextNextRoomTutorial")
    public WebElement nextButtonOnHereYouCanSeeInventoryItemsForSelectedRoom;
    @FindBy(id = "closeTutorial1")
    public WebElement okButtonOnHereYouCanSeeInventoryItemsForSelectedRoomText;
    @FindBy(xpath = "/html/body/div/div/div/div[1]/section[3]/div/p[1]/text()")
    public WebElement pressThisButtonToSaveChoosedItemsAndMoveToTheNextRoomText;
    @FindBy(xpath = "//a[@id='closeTutorial2']")
    public WebElement okButtonOnPressThisButtonToSaveChoosedItemsAndMoveToTheNextRoomText;




}
