Feature: Profile
  As User
  I want to see profile page
  So that i can see my profile

  Scenario: As user i able to be succesfully see profile page
    Given I am on login page website (Profile)
    When I am input valid username (Profile)
    And I am input valid password (Profile)
    And I click button login (Profile)
    Then I am on the profile page
