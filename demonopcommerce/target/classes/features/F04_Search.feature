@smoke
Feature: users will be able to search for products with different parameters
  Scenario: user could search using product name
    When user enter product name and clicks on Search button
    Then result is displayed successfully

  Scenario: user could search using sku
    When user enter SKU and clicks on Search button
    Then SKU results is displayed
