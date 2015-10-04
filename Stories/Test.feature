Feature: Logged out customer is able to add items on promo to basket

Scenario: Add items on offer 'Buy any XX for XX' to the basket 

Given a customer on Browse Shop page 
When 'Buy any XX for XX' promo is available And promotion conditions are met 
Then total amount in basket is calculated correct

 Scenario: Add items from Offers page to basket 

 Given a logged in customer 
 When Offers page is displayed 
 Then add items met promo conditions to trolley
 
 Scenario: As logged out customer add Half price item to basket 
  
 Given a customer on Browse Shop1 page
 When customer add item in Half price promo to basket 
 Then saving field is updated And contains correct savings value

