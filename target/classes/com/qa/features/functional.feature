Feature: Acceptance testing to validate order items
Scenario: Validate User is able to add products to cart and place order 
Given User is on the home page 
When User adds two products to cart
When User navigate to cart and proceed to checkout
When user sign in using username and password 
| lakshmi2011.v@gmail.com | lakshmi@123 |
When User proceed address information 
When user provides shipping details 
When user places order
Then check order places successfully
