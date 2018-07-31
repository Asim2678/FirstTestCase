Feature: as a user i loged into the website and can add a product into shopping cart

  Background: open website
    Given navigate to the http://demonopcommerce.com and loged in

  Scenario: verify user can add a product to shopping cart
    Given as a user i Search for a product in search box for "Laptop"
    When I add laptop to shopping cart
    Then I should see the product added to shopping cart

  Scenario: verify user can change the quantity of product in shopping cart
    Given as a user i Search for a product in search box for "Laptop"
    When I add laptop to shoping cart
    And change its quantity from (1) to (10)
    Then I should see the correct product quantity after updating the shopping cart

  Scenario: verify user can see the product price in shopping cart
    Given as a user i Search for a product in search box for "Laptop"
    When I add a laptop to shoping cart
    Then I should see the product price in shoping cart

  Scenario: verify user can change price units in shopping cart
    Given as a user i Search for a product in search box for "Laptop"
    When I add a laptop to shoping cart
    And Changed product price units from Dollars to Euro
    Then I should see the product price in Euros after updating the shoping cart

  Scenario: verify user can see product in shopping cart in another session
    Given as a user i Search for a product in search box for "Laptop"
    When I add a laptop to shoping cart
    And loged off from the website
    Then I should see the product in shoping cart when log in back in another session

  Scenario: verify user can Proceed products from shopping cart to checkout
    Given as a user i Search for a product in search box for "Laptop"
    When I add a laptop to shoping cart
    And proceed to "checkout"
    Then I should see the product in "checkout"

  Scenario: verify user can remover product from the Shopping cart
    Given as a user i Search for a product in search box for "Laptop"
    And added to the shopping cart
    When I click option to "remove" the product from the shopping cart
    Then I should see the shopping cart empty after update the shopping cart
