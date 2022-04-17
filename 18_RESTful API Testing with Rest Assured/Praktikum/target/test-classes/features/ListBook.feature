Feature: ListBook
  As an Admin
  I want to see list of book
  So that I can know book registered at list

  Scenario: GET - As an Admin I have be able to get list of book
    Given I set method GET at api endpoints
    When I send method GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for list of book