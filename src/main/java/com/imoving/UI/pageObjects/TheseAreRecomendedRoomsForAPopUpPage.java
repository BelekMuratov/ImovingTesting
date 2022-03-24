package com.imoving.UI.pageObjects;

import com.imoving.UI.methods.Helper;
import com.imoving.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TheseAreRecomendedRoomsForAPopUpPage {
    public TheseAreRecomendedRoomsForAPopUpPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[1]/h2/span[1]")
    public WebElement TheseAreRecomendedRoomsForAPopUpText;
    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div/a[2]/span[1]")
    public WebElement continueButton;

    public void clickcontinueButton(){
        Helper.click(continueButton);
    }
}
