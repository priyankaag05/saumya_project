Feature: from Swag Lab add product to cart

  Background: 
    Given I have launched the application
    And I entered correct username as "standard_user" and password as "secret_sauce"
    And I click on Login button

@regression
  Scenario: Adding The product to cart
    When I want to select product "Sauce Labs Backpack" to add to cart
    Then Basket item number should be 1
