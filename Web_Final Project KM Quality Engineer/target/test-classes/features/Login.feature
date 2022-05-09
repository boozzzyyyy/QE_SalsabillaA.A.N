Feature: Login
  As User
  I want to login
  So that i can login at the website

  Scenario: As user i able to be succesfully login
    Given I am on login page website for login
    When I am input valid email for login
    And I am input valid password for login
    And I click button login for login
    Then I am on the home page for login
