Feature: Filter Products with different color
  As a user
  I want to filter color of the products


     Scenario: Search product on the application
       Given I am on the Web Application page
        When I click on the Sign in text
        When I enter the email
        When I enter the password
        When I click on the Sign In button
        When I search any product on the search bar
        When I click on the search button
        When I click the product
        When I click the Blue color checkbox
        When I click the Orange color checkbox
        Then I should be able to see the product colors