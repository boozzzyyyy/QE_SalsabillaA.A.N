Feature: Search
  As User
  I want to search a book
  So that i can search a book by keyword

  Scenario: As user i able to be succesfully search a book
    Given I am on book page
    When I click search field
    And I am input keyword at search field
    Then I see list book filtered by a keyword
