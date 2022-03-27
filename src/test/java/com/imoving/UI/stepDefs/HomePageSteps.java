package com.imoving.UI.stepDefs;

import com.imoving.UI.dataProviders.ConfigReader;
import com.imoving.UI.methods.CustomAssertions;
import com.imoving.UI.methods.DropDownMethod;
import com.imoving.UI.methods.Helper;
import com.imoving.UI.pageObjects.*;
import com.imoving.UI.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class HomePageSteps {

    WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();
    TheseAreRecomendedRoomsForAPopUpPage theseAreRecomendedRoomsForAPopUpPage = new TheseAreRecomendedRoomsForAPopUpPage();
    LivingRoomPage livingRoomPage = new LivingRoomPage();
    DiningRoom diningRoom = new DiningRoom();
    KitchenRoomPage kitchenRoomPage = new KitchenRoomPage();
    BedRoomPage bedRoomPage = new BedRoomPage();
    BoxCalculator boxCalculator = new BoxCalculator();
    MovingDetailsPage movingDetailsPage = new MovingDetailsPage();

    @Given("user is on qa environment")
    public void user_is_on_qa_environment() {
        driver.get(ConfigReader.getProperty("environment"));

    }
    @When("user should click labor tab button")
    public void user_should_click_labor_tab_button() {
        Helper.click(homePage.laborTab);
        Helper.pause(500);
    }
    @Then("user should see {string} and {string} texts")
    public void user_should_see_and_texts(String string, String string2) {
        
       
    }
    @Given("user should select {string} in What are you moving drop down")
    public void user_should_select_in_what_are_you_moving_drop_down(String MyApartment) {
        DropDownMethod.selectUsingVisibleText(homePage.WhatAreYouMovingSelectList, MyApartment);
        Helper.pause(500);
    }
    @Then("{string} should be selected")
    public void should_be_selected(String MyApartment) {
        Assertions.assertEquals(MyApartment,Helper.getTextValue(homePage.WhatAreYouMovingDropDownSelectedMenu));

    }
    /// second scenario
    @Given("user clicks Moving Tab button")
    public void user_clicks_moving_tab_button() {
       Helper.click(homePage.movingTabButton);
        Helper.pause(500);
        
    }
    @When("user select {string} in What are you moving drop down")
    public void user_select_in_what_are_you_moving_drop_down(String MyApartment) {
       DropDownMethod.selectUsingVisibleText(homePage.WhatAreYouMovingSelectList,MyApartment);
        Helper.pause(500);
    }
    @When("user should select {string} in Move Size drop down")
    public void user_should_select_in_move_size_drop_down(String oneBedroom) {
        DropDownMethod.selectUsingVisibleText(homePage.moveSizeList,oneBedroom);
        Helper.pause(500);
    }
    @Then("user should click on Compare Quotas button")
    public void user_should_click_on_compare_quotas_button() {
       Helper.click(homePage.CompareQuotesButton);
        Helper.pause(500);
    }
    @Then("{string} pop up should appear")
    public void pop_up_should_appear(String theseAreRecommendedRoomsForA) {
       CustomAssertions.assertText("Pop Up",theseAreRecommendedRoomsForA,theseAreRecomendedRoomsForAPopUpPage.TheseAreRecomendedRoomsForAPopUpText);
        Helper.pause(500);
    }
    @Then("user clicks on Continue button in These are recommended rooms for a page")
    public void user_clicks_on_continue_button_in_these_are_recommended_rooms_for_a_page(){
       theseAreRecomendedRoomsForAPopUpPage.clickcontinueButton();
       Helper.pause(500);
    }
    @Then("Boxes pop up should appear with {string} button")
    public void boxes_pop_up_should_appear_with_button(String GotIt) {
       Assertions.assertEquals(GotIt,Helper.getTextValue(homePage.GotItButtonText));
       Helper.pause(500);
    }
    @When("user clicks on GOT IT button in boxes pop up")
    public void user_clicks_on_got_it_button_in_boxes_pop_up() {
       Helper.click(homePage.GotItButton);
       Helper.pause(500);
    }
    @Then("user should see hint {string}")
    public void user_should_see_hint(String hereYouCanSeeAllYourRoomsAndStartMoving) {
        CustomAssertions.assertText("text",hereYouCanSeeAllYourRoomsAndStartMoving, homePage.hereYouCanSeeAllYourText);
        
    }
    @When("user clicks to next button in Here you can see all your rooms and start moving")
    public void user_clicks_to_next_button_in_here_you_can_see_all_your_rooms_and_start_moving() {
    Helper.click(homePage.nextButtonOnHereYouCanSeeAllYourRoomsAndStartMoving);
        Helper.pause(500);
    }
    @Then("user see {string} hint")
    public void user_see_hint(String hereYouCanSeeInventoryItemsForSelectedRoom) {
    CustomAssertions.assertText("text", hereYouCanSeeInventoryItemsForSelectedRoom,homePage.hereYouCanSeeInventoryItemsForSelectedRoomText);
        
    }
    @Then("user should click next button in Here you can see inventory items for selected room!")
    public void user_should_click_next_button_in_here_you_can_see_inventory_items_for_selected_room() {
       Helper.click(homePage.nextButtonOnHereYouCanSeeInventoryItemsForSelectedRoom);
        Helper.pause(500);
    }
    @Then("user should see {string}")
    public void user_should_see(String pressThisButtonToSaveChoosedItemsAndMoveToTheNextRoom) {
      //  Assertions.assertEquals(pressThisButtonToSaveChoosedItemsAndMoveToTheNextRoom,Helper.getTextValue(homePage.pressThisButtonToSaveChoosedItemsAndMoveToTheNextRoomText));
        
    }
    @Then("user should click ok button in Press this button to save choosed items and move to the next room!")
    public void user_should_click_ok_button_in_press_this_button_to_save_choosed_items_and_move_to_the_next_room() {
       Helper.click(homePage.okButtonOnPressThisButtonToSaveChoosedItemsAndMoveToTheNextRoomText);
        Helper.pause(500);
    }
    @Then("user should click add to inventory sofa in living room")
    public void user_should_click_add_to_inventory_sofa_in_living_room() {
       Helper.click(livingRoomPage.imageSofa);
        Helper.pause(500);
       Helper.click(livingRoomPage.AddToInventoryButtonOnSofa);
        Helper.pause(500);
    }
    @Then("user should click add to inventory TV in Living room")
    public void user_should_click_add_to_inventory_tv_in_living_room() {
        Helper.click(livingRoomPage.imageTV);
        Helper.pause(500);
        Helper.click(livingRoomPage.AddToInventoryButtonOnTV);
        Helper.pause(500);
    }
    @Then("user should click to save and go to next in Living room")
    public void user_should_click_to_save_and_go_to_next_in_living_room() {
       Helper.click(livingRoomPage.saveAndGoToTheNextButtonOnLivinfRoom);
        
    }

    @Then("user should click add to inventory Kitchen\\/Dining Chairs in Dining room")
    public void user_should_click_add_to_inventory_kitchen_dining_chairs_in_dining_room() {
        Helper.click(diningRoom.imageKitchenDiningChairs);
        Helper.pause(500);
        Helper.click(diningRoom.addToInventoryButtonOnKitchenDiningChairs);
        Helper.pause(500);
    }
    @Then("user should click add to inventory Kitchen\\/Dining Table in Dining room")
    public void user_should_click_add_to_inventory_kitchen_dining_table_in_dining_room() {
        Helper.click(diningRoom.imageKitchenDinigTable);
        Helper.pause(500);
        Helper.click(diningRoom.addToInventoryButtonOnKitchenAndDinigTable);
        Helper.pause(500);
    }
    @Then("user should click to save and go to next in Dining room")
    public void user_should_click_to_save_and_go_to_next_in_dining_room() {
        Helper.click(diningRoom.saceAndGoToNextButton);

    }
    @Then("user should click add to inventory Kitchen\\/Dining Chairs in Kitchen")
    public void user_should_click_add_to_inventory_kitchen_dining_chairs_in_kitchen() {
        Helper.click(kitchenRoomPage.imageKitchenDiningChairs);
        Helper.pause(500);
        Helper.click(kitchenRoomPage.addToInventoryOnKitchenAndDiningChairs);
        Helper.pause(500);
    }
    @Then("user should click add to inventory Kitchen\\/Dining Table in Kitchen")
    public void user_should_click_add_to_inventory_kitchen_dining_table_in_kitchen() {
        Helper.click(kitchenRoomPage.imageKitchenDiningTables);
        Helper.pause(500);
        Helper.click(kitchenRoomPage.addToInventoryOnKitchenAndDiningTables);
        Helper.pause(500);
    }
    @Then("user should click to save and go to next in Kitchen")
    public void user_should_click_to_save_and_go_to_next_in_kitchen() {
       Helper.click(kitchenRoomPage.saveAndGoToNextButton);

    }
    @Then("user should click add to inventory dresser in Bedroom")
    public void user_should_click_add_to_inventory_dresser_in_bedroom() {
        Helper.click(bedRoomPage.imageDresser);
        Helper.pause(500);
        Helper.click(bedRoomPage.addToInventoryDresserButton);
        Helper.pause(500);
    }
    @Then("user should click add to inventory bed in Bedroom")
    public void user_should_click_add_to_inventory_bed_in_bedroom() {
        Helper.click(bedRoomPage.imageBed);
        Helper.pause(500);
        Helper.click(bedRoomPage.addToInventoryBedButton);
        Helper.pause(500);
    }
    @Then("user should click to save and go to next in Bedroom")
    public void user_should_click_to_save_and_go_to_next_in_bedroom() {
        Helper.click(bedRoomPage.saveAndGoToNextButton);

    }

    @Then("user should see Box Calculator text")
    public void user_should_see_box_calculator_text() {

        
    }
    @Then("user should click Add and Continue")
    public void user_should_click_add_and_continue() {
       Helper.click(boxCalculator.addAndContinueButton);
        
    }
    @Then("user should see text {string}")
    public void user_should_see_text(String string) {
        Helper.pause(500);
        
    }
    @Then("user should enter zip code or adress to pick up from field")
    public void user_should_enter_zip_code_or_adress_to_pick_up_from_field() {
        Helper.sendkeys(movingDetailsPage.enterZipCodeOrFullAdressFieldPickUpFrom,"Boston, MA 02203");
        Helper.pause(500);
        Helper.sendkeys(movingDetailsPage.enterZipCodeOrFullAdressFieldPickUpFrom,Keys.ARROW_DOWN);
        Helper.pause(300);
        Helper.sendkeys(movingDetailsPage.enterZipCodeOrFullAdressFieldPickUpFrom,Keys.ENTER);
        Helper.pause(300);

    }
    @Then("user should increase flight of stairs to {int}")
    public void user_should_increase_flight_of_stairs_to(int int1) {
        Helper.multipleClick(movingDetailsPage.quantityPlussButtonFlightOfStairsPickUpFrom,int1);
        Helper.pause(500);
    }
    @Then("user should increase long carry foot to {int}")
    public void user_should_increase_long_carry_foot_to(int int1) {
        Helper.multipleClick(movingDetailsPage.quantityPlussButtonLongCarryPickUpFrom,int1);
        Helper.pause(500);
    }
    @Then("user should switch elevator to yes")
    public void user_should_switch_elevator_to_yes() {
        Helper.click(movingDetailsPage.switchButtonElevatorPickUpFrom);
        Helper.pause(500);
    }
    @Then("user should switch Need shuttle to yes")
    public void user_should_switch_need_shuttle_to_yes() {
        Helper.click(movingDetailsPage.switchButtonNeedShuttlePickUpFrom);
        Helper.pause(500);;
    }
    @Then("user should enter address instructions")
    public void user_should_enter_address_instructions() {
        Helper.sendkeys(movingDetailsPage.addresInstructionsInputFieldPickUpFrom,"this is test");
        Helper.pause(500);
    }
    @Then("user should click Approve button")
    public void user_should_click_approve_button() {
        Helper.click(movingDetailsPage.approveButtonPickUpFrom);
        Helper.pause(500);
    }
    @Then("user should enter zip code or adress to Dropp of at field")
    public void user_should_enter_zip_code_or_adress_to_dropp_of_at_field() {
        Helper.sendkeys(movingDetailsPage.enterZipCodeOrFullAdressFieldDroppOfAt,"Nebraska, 68813");
        Helper.pause(500);
        Helper.sendkeys(movingDetailsPage.enterZipCodeOrFullAdressFieldDroppOfAt,Keys.ARROW_DOWN);
        Helper.pause(300);
        Helper.sendkeys(movingDetailsPage.enterZipCodeOrFullAdressFieldDroppOfAt,Keys.ENTER);
        Helper.pause(300);
        
    }
    @Then("user should should increase flight of stairs to {int}")
    public void user_should_should_increase_flight_of_stairs_to(Integer int1) {
        Helper.multipleClick(movingDetailsPage.quantityPlussButtonFlightOfStairsDroppOfAt,int1);
        Helper.pause(200);
    }
    @Then("user should increase long carry foot to {int} at Dropp of at")
    public void user_should_increase_long_carry_foot_to_at_dropp_of_at(int int1) {
       Helper.multipleClick(movingDetailsPage.quantityPlussButtonOfLongCarryFootDroppOfAt,int1);
        Helper.pause(200);
    }
    @Then("user should switch elevator to yes at Dropp of at")
    public void user_should_switch_elevator_to_yes_at_dropp_of_at() {
       Helper.click(movingDetailsPage.switchButtonElevatorDroppOfAt);
        Helper.pause(200);
    }
    @Then("user should switch Need shuttle to yes at Dropp of at")
    public void user_should_switch_need_shuttle_to_yes_at_dropp_of_at() {
       Helper.click(movingDetailsPage.switchButtonNeedShuttleDroppOfAt);
       Helper.pause(200);
    }
    @Then("user should enter address instructions at Dropp of at")
    public void user_should_enter_address_instructions_at_dropp_of_at() {
       Helper.sendkeys(movingDetailsPage.addresInstructionsInputFieldDroppOfAt,"this is test");
       Helper.pause(200);
    }
    @Then("user should click Approve button at Dropp of at")
    public void user_should_click_approve_button_at_dropp_of_at() {
       Helper.click(movingDetailsPage.approveButtonDroppOfAt);
       Helper.pause(200);
       
    }

    @Then("user should choose date")
    public void user_should_choose_date() {
       Helper.click(movingDetailsPage.calendar);
       Helper.pause(200);
       Helper.click(movingDetailsPage.monthsButton);
       Helper.pause(200);
       Helper.click(movingDetailsPage.december);
       Helper.pause(200);
       Helper.click(movingDetailsPage.tenthDecember);
       Helper.pause(200);

    }
    @Then("user should choose the first available date in which you are able to receive your items")
    public void user_should_choose_the_first_available_date_in_which_you_are_able_to_receive_your_items() {
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(movingDetailsPage.slider,300, 50).perform();
        
    }
    @Then("user should click confirm button")
    public void user_should_click_confirm_button() {
        Helper.click(movingDetailsPage.confirmButton);
        Helper.pause(200);
        
    }
    @Then("user should select Full Packing Service")
    public void user_should_select_full_packing_service() {
        Helper.click(movingDetailsPage.fullPackaging);
        Helper.pause(200);
        
    }
    @Then("user should click Choose Movers button")
    public void user_should_click_choose_movers_button() {
        Helper.click(movingDetailsPage.chooseMoversButton);
        Helper.pause(200);
        Helper.click(movingDetailsPage.dontHaveCabinetsButton);
        Helper.pause(5000);
    }

}
