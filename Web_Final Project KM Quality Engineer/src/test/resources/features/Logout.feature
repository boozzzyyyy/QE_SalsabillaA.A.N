Feature: Logout
  As User
  I want to logout
  So that i can logout from the website

  Scenario: As user i able to be successfully logout
    Given I am on login page website for logout
    When I am input valid email for logout
    And I am input valid password for logout
    And I click button login for logout
    And I am on the home page for logout
    And I click icon user for logout
    And I click button logout for logout
    Then I am on login page after successfully logout for logout