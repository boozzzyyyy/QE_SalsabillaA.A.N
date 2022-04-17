Feature: RequestConnection
  As a user
  I want to expand my relation
  So that I can request a connection to other

  Scenario: As user i have be able to request a connection to other
    Given I am on the my network page
    When I choose a people from suggestion panel
    And I click button connect
    Then I can see the button succesfully change to requested