Feature: CreateUser
  As an Admin
  I want to create new user
  So that I can add new user

  Scenario: GET - As an Admin I have be able to create new user
    Given I set method POST at api endpoints for create user
    When I send method POST HTTP request for create user
    Then I receive valid HTTP response code 201 for create user
    And I receive valid message user created succesfully