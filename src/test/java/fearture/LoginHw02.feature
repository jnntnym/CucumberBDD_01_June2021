Feature: Login feature test
  Scenario: Login with valid email but invalid password
    Given I am at Talenttek Sign in page
    And I enter valid email
    And I enter invalid password
    When I click on Log in button
    Then I should not be able to Log in with incorrect password