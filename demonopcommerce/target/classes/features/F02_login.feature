@smoke
Feature: guest user could Login with valid credentials

  Scenario: user could Login with valid credentials
    Given user clicks on login Tab and goes to Login page
    And user put email"automation@gmail.com"
    And put password"P@ssw0rd"
    When click in login bottom
    Then Check that user login correctly