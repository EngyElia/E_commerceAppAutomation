@smoke
Feature: User could register with valid

Scenario:  guest user could register with valid data successfully
Given user clicks on Register Tab
  And user fills Personal Details
  And user put her birthdate
  And user put email"automation@gmail.com"
  And company name
  And put password"P@ssw0rd"
  When user put her password and click register
  Then check that user register successfully



