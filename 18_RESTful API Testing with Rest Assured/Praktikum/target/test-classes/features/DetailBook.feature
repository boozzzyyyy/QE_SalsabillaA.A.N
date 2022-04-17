Feature: DetailBook
  As an Admin
  I want to see detail of book
  So that I can know detail data of book

  Scenario: GET - As an Admin I have be able to get detail of book
    Given I set method GET at api endpoints for detail book
    When I send method GET HTTP request with parameter ISBN for detail book
    Then I receive valid HTTP response code 200 for detail book
    And I receive valid data for detail of book