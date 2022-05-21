Feature: Login, As User I want to login, So that i can login at the app
  Scenario: As user i able to be succesfully login
    Given User on the home page for login
    When User click icon login for login
    And User on the login page for login
    And User input "salsabillanugraha10@gmail.com" on email field for login
    And User input "salsacantik" on password field for login
    And User click login button for login
    Then User success login for login
