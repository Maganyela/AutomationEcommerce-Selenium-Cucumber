@Third
Feature: Search product
  As a user
  I want to search product to the application
  with the valid names of the product


    Scenario: Search product on the application
      Given I am on the Web Application page
      When I click on the Sign in text
      When I enter the email
      When I enter the password
      When I click on the Sign In button
      When I search any product on the search bar
      When I click on the search button
      Then I should be able to see the product