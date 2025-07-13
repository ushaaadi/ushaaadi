@LoginTest
Feature: Login functionality

  Scenario: Successful login with valid credentials
    Given User is on the login page
    When User enters valid credentials
    Then User should see the "Data Structures-Introduction" heading
