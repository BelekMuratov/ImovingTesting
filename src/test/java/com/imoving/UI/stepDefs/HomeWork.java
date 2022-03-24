package com.imoving.UI.stepDefs;


import com.imoving.UI.dataProviders.ConfigReader;
import com.imoving.UI.methods.Helper;
import com.imoving.UI.pageObjects.HomePage;
import com.imoving.UI.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeWork {
    WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();

    @Given("user is on qaa environment")
    public void user_is_on_qaa_environment() {
        driver.get(ConfigReader.getProperty("environment"));
        
    }
    @When("user should select My Appartment")
    public void user_should_select_my_appartment() {
        Select select = new Select(homePage.WhatAreYouMovingSelectList);
        select.selectByValue(String.valueOf(1079));
        Helper.pause(4000);
    }
    @When("user should select {int} Bedroom on Move Size")
    public void user_should_select_bedroom_on_move_size(Integer int1) {
        Select select = new Select(homePage.moveSizeList);
        select.selectByIndex(5);
        Helper.pause(4000);
        
    }
}
