Feature: LikePost
  As a user
  I want to give a like for post from my mutual
  So that I can give a appreciate to my mutual

  Scenario: As user i have be able to give a like to some post
    Given I am on the timeline page
    When I hover a like button from a post
    And I choose and click an expression like post
    Then I give a like to that post