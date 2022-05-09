Feature: GetAllCategory
  As an Admin
  I want to get data category
  So that I can get all data category

  Scenario: GET - As an Admin I have be able to get all data category
    Given I set method GET at api endpoints for get all data category
    When I send method GET HTTP request for get all data category
    Then I receive valid HTTP response code 200 for get all data category
    And I receive valid message get all data category succesfully