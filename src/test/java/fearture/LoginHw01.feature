Feature: Login feature test
  Scenario: Login with invalid email but valid password
    Given I am at Talenttek Sign in page
    And I enter invalid email
    And I enter valid password
    When I click on Log in button
    Then I should not be able to Log in with incorrect email or student id