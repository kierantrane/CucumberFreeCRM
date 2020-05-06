Feature: Free CRM Login Feature

Scenario: Free CRM Login Scenario

Given User is already on login Page
When Title of page is Free CRM
Then user enters username and password
Then user clicks on login button  
Then user is on homepage
Then close the browser


Scenario: Free CRM Login Scenario2

Given User is already on login Page2
When Title of page is Free CRM2
Then user enters username and password2
Then user clicks on login button2
Then user is on homepage2
Then close the browser2

Scenario: User is able to create a new contact
Given User is already on home page
When user mouse over contacts link
Then user clicks on New Contact link
Then User enters First Name and Last Name
Then Verify the contact is created


#https://classic.crmpro.com/login.cfm
