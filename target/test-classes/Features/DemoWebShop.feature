#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

 @DemoWeb
 Scenario Outline: navigating to Demo Web Shop Application
 Given Open the browser 
 When Enter the URL "https://demowebshop.tricentis.com/" 
 And Click on register button
 And Enter the details "<FirstName>" , "<LastName>" , "<Gender>" , "<Email>" and "<Password>"
 Then Click on save

    Examples:
     | FirstName | LastName | Gender | Email | Password |
     | Nitin | Goel | Male | mannugoel | Test@123 |
     
@login
Scenario: Click on login button and enter user and password and click on login

 Given Open the browser 
 When Enter the URL "https://demowebshop.tricentis.com/" 
Then click logged in
Then enter username and password and click enter

@cart
Scenario: add cart

Given Open the browser 
When Enter the URL "https://demowebshop.tricentis.com/" 
Then click logged in
Then enter username and password and click enter

Then click phone and add to cart

