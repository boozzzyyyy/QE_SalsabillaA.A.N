Feature: CreateCategory
  As an Admin
  I want to create category
  So that I can add new category for product

  Scenario: POST - As an Admin I have be able to add new category for product
    Given I set method POST at api endpoints for add new category
    When I send method POST HTTP request for add new category
    Then I receive valid HTTP response code 200 for add new category
    And I receive valid message category created succesfully