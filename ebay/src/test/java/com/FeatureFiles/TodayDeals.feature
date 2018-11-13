
Feature: Login functionality

  Scenario: Check whether user is able to search an item
    Given I want to open a "Chrome" browser
    Then I want to launch the application
  	And I want to select an item "Watches" from "//input[@id='gh-ac']"
  	Then I want to click Search button "//input[@id='gh-btn']"
  	And I want to close the browser