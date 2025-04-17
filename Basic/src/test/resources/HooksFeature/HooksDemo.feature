Feature: 
  Check valid login functionality

  Scenario: 
    Given user is in login page
    When user enters username and password
    And click submit
    Then user will be navigated to home page

  @smoke
  Scenario: 
    Given user is in login page
    When user enters username and password
    And click submit
    Then user will be navigated to home page
