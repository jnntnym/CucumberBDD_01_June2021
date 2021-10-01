Feature: Sign up
  Scenario: Student should be able to register with valid information
    Given I am at TalentTek Sign in page
    And I click create new account button in login page
    And I enter valid student information
    When I click on create my account button
    Then I should see Thank you for sign up message