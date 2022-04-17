Feature: UploadPost
  As a user
  I want to share my interest at my post to my mutual
  So that I can upload a post to timeline page

  Scenario: As user i have be able to upload a post
    Given I am on the timeline page
    When I enter what im interest at my post
    And I click button posting
    Then I can see my post succesfully show at my timeline page