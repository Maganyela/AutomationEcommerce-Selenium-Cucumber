Feature: CashOut the product that is in the cart
  As a user
  I want to CashOut the selected product in to the cart



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
    When I click the Proceed to cashOut Initially
    When I click on the Proceed to cashOut on Summary stage
    When I click the proceed to cashOut on Address stage
    When I click the proceed to cashOut on Shipping stage
    When I click on the Cash by check on Payment stage
    When I click on the confirm my order button
    When I click on the view order history button
    When I click on the back to you account button
    Then I should navigate to the home page
