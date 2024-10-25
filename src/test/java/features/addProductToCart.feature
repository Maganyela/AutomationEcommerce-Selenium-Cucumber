Feature: Add different product to the cart
  As a user
  I want to add the selected product in to the cart



        Scenario: Select Categories on the application
          Given I am on the Web Application page
          When I click on the Sign in text
          When I enter the email
          When I enter the password
          When I click on the Sign In button
          When I search any product on the search bar
          When I click on the search button
          When I click on the Woman button
          When I click on the plus sign to open the field
          When I click on the Blouses text
          When I click the Visible product
          When I click the White color
          When I click the Add to cart button
          When I click the Proceed to cashOut button
          Then The product should be in the cart ready for cashout