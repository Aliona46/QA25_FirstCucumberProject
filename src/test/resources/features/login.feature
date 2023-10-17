Feature: Login

  @login
  Scenario: Login with valid data
    Given User launches ChromeBrowser
    When User opens ilcarro Home Page
    And User clicks on Log in link
    And User enters valid data
    And User clicks on Yalla button
    Then User verifies log in message is displayed
    And User quits browser

  @wrongPassword
  Scenario Outline: Login with valid email and wrong password
    Given User launches ChromeBrowser
    When User opens ilcarro Home Page
    And User clicks on Log in link
    And User enters valid email and wrong password
      | email   | password   |
      | <email> | <password> |
    And User clicks on Yalla button
    Then User verifies error message
    And User quits browser
    Examples:
      | email            | password |
      | aliona@gmail.com | 12344Ali |
      | aliona@gmail.com | 12344444 |
      | aliona@gmail.com | Aliiiii$ |
      | aliona@gmail.com | $%&&(&"$ |

