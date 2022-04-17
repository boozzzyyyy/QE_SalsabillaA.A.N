Feature: GiveComment
  As a user
  I want to give a comment to post from my mutual
  So that I can give a comment to my mutuals post

  Scenario: As user i have be able to upload a post
    Given I am on the timeline page
    When I choose my mutual post and enter a comment
    And I click button Enter at my keyboard
    Then I can see my comment posted succesfully at the bottom my mutuals post