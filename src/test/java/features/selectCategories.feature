Feature: Select Different Categories
  As a user
  I want to select different categories on the Application


    Scenario: Select Categories on the application
      Given I am on the Web Application page
      When I click on the Sign in text
      When I enter the email
      When I enter the password
      When I click on the Sign In button
      When I search any product on the search bar
      When I click on the search button
      When I click on the Dresses button
      When I click on Casual dress checkbox
      When I click on Evening dress checkbox
      When I click on Summer dress checkbox
      Then I should be able to see the different product