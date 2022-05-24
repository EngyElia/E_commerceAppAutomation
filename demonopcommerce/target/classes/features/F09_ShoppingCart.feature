@smoke
Feature: Guest user could add products to Shopping Cart

  Scenario: success message is visible after adding product to Shopping Cart
    When user chooses product and clicks on Shopping Cart
    Then Shopping Cart message is displayed successfully