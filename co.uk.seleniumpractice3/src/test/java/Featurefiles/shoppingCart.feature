Feature: as a user i loged into the website and can look for toys 
 
 
Background: open website 
 
	Given navigate to the "https://demostore.x-cart.com//" 
 
 Scenario: 
	verify user can search for a product 

	Given As a user I Search for "toys" in search box 
 
	When I can search results 
 Then I should see the "toys" in the saerch page 
