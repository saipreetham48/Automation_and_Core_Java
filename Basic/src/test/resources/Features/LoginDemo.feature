Feature: Test the login functionality

  Scenario Outline: validate the login functionality is working
    Given Browser is opened
    And user is on the webpage
    When user entered the <username> and <password>
    And user hit submit button
    Then user navigated to logout page.

   
