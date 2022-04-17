Feature: Logout
  As User
  I want to logout my account
  So that i can logout my account from this website

  Scenario: As user i able to be succesfully logout
    Given I am on login page website (Logout)
    When I am input valid username (Logout)
    And I am input valid password (Logout)
    And I click button login (Logout)
    And I am on the profile page (Logout)
    And I click button logout
    Then I am back to login page website
