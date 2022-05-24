@smoke
Feature: user could hover categories and select sub category
Scenario: user could hover categories
  When user hover category "Computers" and select subcategory "desktops"
  Then subcategory is displayed correctly