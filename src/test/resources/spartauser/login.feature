@spuserlogin
Feature: Login
  As a sparta user
  I want to login so that
  I can see Administration tab

  Scenario: Sparta login with valid credentials
    Given I am on login page
    When I enter Username as ‘Kuldeep’
    And I enter Password as ‘Kuldeep_opencast18’
    And I select Submit button
    Then I should see a pop up
    And I select ok
    And I should be on Home Page

  Scenario Outline: Sparta login with invalid credentials
    Given I am on login page
    When I enter ‘<username>’ and '<password>'
    And I select Submit button
    Then I should not logged in
    And I should see a message as '<message>'

  Examples:

    |username|password|message|
    |kuldeep12|kuldeep_opencast|Login failed|
    |     |     |Login failed|
    |kuldeep|kdiiuueert|Login failed|

  @spuser_reset
  Scenario: Reset credentials entered
    Given I am on login page
    When I enter Username as ‘Kuldeep’
    And I enter Password as ‘Kuldeep_opencast9’
    And i select Reset button
    Then I should see Username and Password text box blank