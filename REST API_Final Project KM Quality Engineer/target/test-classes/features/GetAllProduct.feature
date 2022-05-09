Feature: GetAllProduct
  As an Admin
  I want to get data product
  So that I can get all data product

  Scenario: GET - As an Admin I have be able to get all data product
    Given I set method GET at api endpoints for get all data product
    When I send method GET HTTP request for get all data product
    Then I receive valid HTTP response code 200 for get all data product
    And I receive valid message get all data product succesfully