@smoke
Feature: guest user could switch between currencies [$, €]

Scenario:  user switches between currencies US Dollar and Euro
  When user chooses currency
  Then currency is displayed correctly