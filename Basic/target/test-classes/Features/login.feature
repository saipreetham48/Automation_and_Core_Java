Feature: feature to check login functionality,

  @smoketest
  Scenario: check login is successful with valid credentials
    Given user is on the login page
    When user enters username and password
    And user clicks the login button
    Then user is navigated to the home page
