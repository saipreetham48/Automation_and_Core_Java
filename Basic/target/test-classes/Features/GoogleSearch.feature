Feature: feature to test Google search functionality

  Scenario: Validating googlesearch is working
    Given browser is open
    And user is on webpage
    When user entering text in the textbox
    And hits enter
    Then navigate to the search results
