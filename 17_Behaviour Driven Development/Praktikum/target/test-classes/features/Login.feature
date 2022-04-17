Feature: Login
  As a user
  I want to see my timeline page
  So that I can see people shahre what they interest

  Scenario: As user i have be able to success login
    Given I am on the login page
    When I enter my email and password correctly
    And I click login button
    Then I am on the timeline page