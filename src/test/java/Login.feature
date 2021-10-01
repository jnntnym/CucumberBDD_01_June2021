Feature: Login Feature Test
  Scenario: Login with valid email and password
    Given I am at TalentTek Sign in page
    And I enter valid email address
    And I enter valid password
    When I click on login button
    Then I should be able to successfully login
