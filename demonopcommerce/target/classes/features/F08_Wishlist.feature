@smoke
Feature:Guest user could add products to wishlist

Scenario: success message is visible after adding product to wishlist
  When user chooses product and press wishlist Tab
  Then notification message is displayed successfully