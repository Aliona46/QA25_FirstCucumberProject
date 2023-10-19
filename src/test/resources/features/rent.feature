Feature: rentCar

  @rent
  Scenario: Input data for rent
    Given User launches ChromeBrowser
    When User opens ilcarro Home Page
    And User clicks on Log in link
    And User enters valid data
    And User clicks on Yalla button
    And User clicks on Let the car work link
    And User enters Location
    And User enters Manufacture, Model, Year
    And User enters Fuel
    And User enters Seats, Car class, Registration number,Price, About
    And User adds Photo
    And User clicks on Submit button
    Then User verifies success message is displayed
    And User quits browser