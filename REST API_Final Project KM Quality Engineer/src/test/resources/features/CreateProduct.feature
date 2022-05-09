Feature: CreateProduct
  As an Admin
  I want to create product
  So that I can add new product

  Scenario: POST - As an Admin I have be able to add new product
    Given I set method POST at api endpoints for add new product
    When I send method POST HTTP request for add new product
    Then I receive valid HTTP response code 200 for add new product
    And I receive valid message product created succesfully