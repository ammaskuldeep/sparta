@reset
Feature: I want to reset the login fields

  Scenario: I use Reset button to clear login fields
    Given I am on login page
    When I enter Username as ‘Kuldeep’
    And I enter Password as ‘Kuldeep_opencast9’
    And i select Reset button
    Then I should see Username and Password text box blank
