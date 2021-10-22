Feature: Sign up
  @qa   @signup
  Scenario: Student should be able to register with valid information
    Given I am at TalentTek Sign in page
    And I click Create New Account button in login page
    And I enter valid student information
    And I agree with terms
    When I click on Create My Account button
    Then I should see Thank you for sign up message