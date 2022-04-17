Feature: Login
  As User
  I want to login
  So that i can login at the website

  Scenario: As user i able to be succesfully login
    Given I am on login page website
    When I am input valid username
    And I am input valid password
    And I click button login
    Then I am on the home page and see my username
