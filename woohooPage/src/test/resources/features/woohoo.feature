Feature: 
  To test the webelements in woohoo page

  Background: launching the browser
    Given Launch the browser and login to the page


  Scenario: To test home page and headers
    Then user is on home page
    And i should see the following mainheaders are displayed
      | woohoo by pine labs |
      | Search By           |
      | Download App        |
      | Login/Register      |
    And I should see the following headers are displayed
      | Brand Cards     |
      | Categories      |
      | Woohoo Coins    |
      | Offers          |
      | Buy One Get One |
      | Redeem Woohoo   |

  Scenario: To test the giftcard on the webpage
    When user clicks on "Brand Cards" in home page
    Then user is on the Brandgiftcards page
    And user click on "BigBasket" card
    Then i should see the "BigBasket e-giftcard" page
