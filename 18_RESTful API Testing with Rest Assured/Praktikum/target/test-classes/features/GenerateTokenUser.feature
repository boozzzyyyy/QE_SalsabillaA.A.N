Feature: GenerateTokenUser
  As an Admin
  I want to generate token
  So that I can generate token for specific user

  Scenario: GET - As an Admin I have be able to generate token for specific user
    Given I set method POST at api endpoints for generate token user
    When I send method POST HTTP request for generate token user
    Then I receive valid HTTP response code 201 for generate token user
    And I receive valid message token created succesfully for user