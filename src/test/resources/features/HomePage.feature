
@2E2
Feature: Home page functionalities

  Background:

    Given user is on qa environment


  Scenario: Verify labor tab button is clickable
    When user should click labor tab button
    Then user should see "Enter your zip code" and "Move Date" texts

  Scenario: Verify user can choose My apartment
    Given user should select "My Apartment" in What are you moving drop down
    Then "My Apartment" should be selected
@Smoke
  Scenario: Verify user can add items to each room
    Given user clicks Moving Tab button
    When user select "My Apartment" in What are you moving drop down
    And user should select "1 Bedroom (600-900 sq ft)" in Move Size drop down
    Then user should click on Compare Quotas button
    Then "These are recommended rooms for a" pop up should appear
    Then user clicks on Continue button in These are recommended rooms for a page
    Then Boxes pop up should appear with "GOT IT" button
    When user clicks on GOT IT button in boxes pop up
    Then user should see hint "Here you can see all your rooms and start moving!"
    When user clicks to next button in Here you can see all your rooms and start moving
    Then user see "Here you can see inventory items for selected room!" hint
    Then user should click next button in Here you can see inventory items for selected room!
    Then user should see "Press this button to save choosed items and move to the next room!"
    Then user should click ok button in Press this button to save choosed items and move to the next room!
    Then user should click add to inventory sofa in living room
    Then user should click add to inventory TV in Living room
    Then user should click to save and go to next in Living room
    Then user should click add to inventory Kitchen/Dining Chairs in Dining room
    Then user should click add to inventory Kitchen/Dining Table in Dining room
    Then user should click to save and go to next in Dining room
    Then user should click add to inventory Kitchen/Dining Chairs in Kitchen
    Then user should click add to inventory Kitchen/Dining Table in Kitchen
    Then user should click to save and go to next in Kitchen
    Then user should click add to inventory dresser in Bedroom
    Then user should click add to inventory bed in Bedroom
    Then user should click to save and go to next in Bedroom
    Then user should see Box Calculator text
    Then user should click Add and Continue
    Then user should see text "You finished your inventory list."
    And  user should enter zip code or adress to pick up from field
    Then  user should increase flight of stairs to 10
    And user should increase long carry foot to 5
    Then user should switch elevator to yes
    Then user should switch Need shuttle to yes
    Then user should enter address instructions
    Then user should click Approve button
    Then user should enter zip code or adress to Dropp of at field
    Then user should should increase flight of stairs to 15
    And user should increase long carry foot to 3 at Dropp of at
    Then user should switch elevator to yes at Dropp of at
    Then user should switch Need shuttle to yes at Dropp of at
    Then user should enter address instructions at Dropp of at
    Then user should click Approve button at Dropp of at
    Then user should choose date
    Then user should choose the first available date in which you are able to receive your items
    Then user should click confirm button
    Then user should select Full Packing Service
    Then user should click Choose Movers button


