package com.imoving.UI.pageObjects;

import com.imoving.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MovingDetailsPage {

    public MovingDetailsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[1]/div[1]/address-selection/div/input-auto-complete-address/span/input")
    public WebElement enterZipCodeOrFullAdressFieldPickUpFrom;
    @FindBy(xpath = "//*[@id=\"instraction_btn_1414\"]")
    public WebElement RestrictionsButtonPickUpFrom;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[1]/div[1]/address-selection/div/address-instructions/div/div[2]/ul/li[1]/div/div/button[2]")
    public WebElement quantityPlussButtonFlightOfStairsPickUpFrom;
    @FindBy(xpath = "//*[@id=\"instraction_1414\"]/div/div[2]/ul/li[1]/div/div/button[1]")
    public WebElement quantityMinusButtonFlightOfStairsPickUpFrom;
    @FindBy(xpath = "//*[@id=\"instraction_1414\"]/div/div[2]/ul/li[2]/div/div/button[1]")
    public WebElement quantityMinusButtonOfLongCarryFootPickUpFrom;
    @FindBy(xpath = "//address-selection[@class='pickUpFrom pickupAffix']//li[2]//div[1]//div[1]//button[2]")
    public WebElement quantityPlussButtonLongCarryPickUpFrom;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/section[2]/div[1]/div[1]/div[1]/address-selection[1]/div[1]/address-instructions[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/div[1]/label[1]")
    public WebElement switchButtonElevatorPickUpFrom;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/section[2]/div[1]/div[1]/div[1]/address-selection[1]/div[1]/address-instructions[1]/div[1]/div[2]/ul[1]/li[4]/div[1]/div[1]/label[1]")
    public WebElement switchButtonNeedShuttlePickUpFrom;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/section[2]/div[1]/div[1]/div[1]/address-selection[1]/div[1]/address-instructions[1]/div[1]/div[2]/ul[1]/li[7]/input[1]")
    public WebElement addresInstructionsInputFieldPickUpFrom;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/section[2]/div[1]/div[1]/div[1]/address-selection[1]/div[1]/address-instructions[1]/div[1]/div[2]/ul[1]/li[9]/div[1]/button[1]")
    public WebElement approveButtonPickUpFrom;

    // Dropp Of At
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[1]/div[2]/address-selection/div/input-auto-complete-address/span/input")
    public WebElement enterZipCodeOrFullAdressFieldDroppOfAt;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[1]/div[2]/address-selection/div/button")
    public WebElement restictionsButtonDroppOfAt;
    @FindBy(xpath = "//*[@id=\"instraction_1416\"]/div/div[2]/ul/li[1]/div/div/button[1]")
    public WebElement quantityMinusButtonFlightOfStairsDroppOfAt;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[1]/div[2]/address-selection/div/address-instructions/div/div[2]/ul/li[1]/div/div/button[2]")
    public WebElement quantityPlussButtonFlightOfStairsDroppOfAt;
    @FindBy(xpath = "//*[@id=\"instraction_1416\"]/div/div[2]/ul/li[2]/div/div/button[1]")
    public WebElement quantityMinusButtonOfLongCarryFootDroppOfAt;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[1]/div[2]/address-selection/div/address-instructions/div/div[2]/ul/li[2]/div/div/button[2]")
    public WebElement quantityPlussButtonOfLongCarryFootDroppOfAt;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[1]/div[2]/address-selection/div/address-instructions/div/div[2]/ul/li[3]/div/div/label")
    public WebElement switchButtonElevatorDroppOfAt;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[1]/div[2]/address-selection/div/address-instructions/div/div[2]/ul/li[4]/div/div/label")
    public WebElement switchButtonNeedShuttleDroppOfAt;
    @FindBy(xpath = "//*[@id=\"instraction_1416\"]/div/div[2]/ul/li[5]/div/div/label")
    public WebElement doesThisBuildingRequireACertificateOfInsuranceSwitchButton;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[1]/div[2]/address-selection/div/address-instructions/div/div[2]/ul/li[7]/input")
    public WebElement addresInstructionsInputFieldDroppOfAt;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[1]/div[2]/address-selection/div/address-instructions/div/div[2]/ul/li[9]/div/button")
    public WebElement approveButtonDroppOfAt;
    @FindBy(xpath = "//*[@id=\"where\"]/div[3]/button/span")
    public WebElement  addAdditionalDropOffPlussButton;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/section[2]/div[1]/div[2]/div[1]/date-picker[1]/div[1]/p[1]/input[1]")
    public WebElement calendar;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[2]/div[1]/date-picker/div/p/div/ul/li/div/table/thead/tr[1]/th[2]/button")
    public WebElement monthsButton;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/section[2]/div[1]/div[2]/div[1]/date-picker[1]/div[1]/p[1]/div[1]/ul[1]/li[1]/div[1]/table[1]/tbody[1]/tr[4]/td[3]/button[1]/span[1]")
    public WebElement december;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[2]/div[1]/date-picker/div/p/div/ul/li/div/table/tbody/tr[2]/td[7]/button")
    public WebElement tenthDecember;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[2]/div[2]/div[2]/div/button")
    public WebElement flexibleDate;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/section[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[3]/a[1]/span[1]")
    public WebElement threedaysFlexible;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[2]/div[3]/div[1]/div/div[1]/div[105]")
    public WebElement slider;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[2]/div[5]/h2/button")
    public WebElement confirmButton;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[3]/ul/li[1]")
    public WebElement fullPackaging;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[2]/button")
    public WebElement chooseMoversButton;
    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/div/div/a[1]")
    public WebElement dontHaveCabinetsButton;

}
