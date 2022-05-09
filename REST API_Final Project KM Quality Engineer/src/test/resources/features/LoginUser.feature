Feature: LoginUser
  As an User
  I want to get login
  So that I can login

  Scenario: POST - As an Admin I have be able to login
    Given I set method POST at api endpoints for login user
    When I send method POST HTTP request for login user
    Then I receive valid HTTP response code 200 for login user
    And I receive valid message login user succesfully