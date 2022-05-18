Feature: GetDetailsProduct
  As an Admin
  I want to Get Details Product
  So that I can get data details product

  Scenario: GET - As an Admin I have be able to get data details product
    Given I set method GET at api endpoints for get data details product
    When I send method GET HTTP request for get data details product
    And I receive valid HTTP response code 200 for get data details product
    Then I receive valid message about details product