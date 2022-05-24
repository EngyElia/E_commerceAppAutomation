@smoke
Feature: user could open Follow US Links

  Scenario: user opens Facebook Link
    When user opens Facebook Link
   Then "facebook" is opened in new Tab
#  "https://www.facebook.com/nopCommerce"

  Scenario: user opens Twitter Link
    When user opens Twitter Link
    Then "twitter" is opened in new Tab
#  "https://twitter.com/nopCommerce"

  Scenario: user opens Rss Link
    When user opens Rss Link
    Then "rss" is opened in new Tab
#  "https://demo.nopcommerce.com/news/rss/1"

  Scenario: user opens Youtube Link
    When user opens Youtube Link
    Then "youtube" is opened in new Tab
#  "https://www.youtube.com/user/nopCommerce"