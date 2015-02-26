@spuserlist_ofusers
Feature: View list of users
  As a sparta user
  I want to see users page
  So that I can see list of Users

  Background
    Given I am logged in as sparta user

  Scenario: View list of User names
    Given I am on Homepage
    When I select Administration
    Then I should see menu items
    When I select User
    Then I see a popup
    And I select ok
    And I should see list of User name

  Scenario: Add new user
    Given I am on Homepage
    When I select Administration
    Then I should see menu items
    When I select User
    Then It should navigate to List Users page
    And I see a popup
    And I select ok
    And I should see list of User names
    When I select Create User Account
    Then I should be navigated to Create New User page
    And I see a popup
    And I select ok
    And I should see Create New User form
    When I create a User,I supply information
      |UserName|Password|Forenames|Surname|Organisation|Telephone Number|Email|User Role|Data Access|
      |JNick|Jnick111|Joseph|Nick|Software|0777888999|joseph@software.com|ROLE_USER|90001|
    And I 'Enable' the user
    And Save it
    Then User should be created successfully
    And I should see recently created User in the users list
