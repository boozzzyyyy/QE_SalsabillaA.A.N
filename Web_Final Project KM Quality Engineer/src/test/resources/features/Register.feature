Feature: Register
  As User
  I want to register
  So that i can register at the website

  Scenario: As user i able to be succesfully register
    Given I am on register page website for register
    When I am input valid full name for register
    And I am input valid email for register
    And I am input valid password for register
    And I click button register for register
    Then I am on the login page for register
