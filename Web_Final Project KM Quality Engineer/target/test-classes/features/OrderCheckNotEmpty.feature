Feature: Order Check Not Empty
  As User
  I want to check my order
  So that i can see my order is not empty at the website

  Scenario: As user i able to be check my order is not empty
    Given I am on home page website for order check not empty
    When  I click button Beli at random stuff for order check not empty
    And I click icon cart for order check not empty
    And I am on the order page for order check not empty
    Then I see my order is not empty for order check not empty
