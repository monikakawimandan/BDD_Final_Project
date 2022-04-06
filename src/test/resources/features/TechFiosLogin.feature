@LoginFeature
Feature: TechFios Login Functionality validation 

Background: 
Given User is on the TechFios login page 
Then User should land on Dashbpad page

@Scenario1 
Scenario: 1 user Should Be Able To Login With Valid Credentials 
	Given User is on the TechFios login page 
	When User enters username as "demo@techfios.com"
	When User enters password as "abc123"
#	When User clicks on signin button
	When User clicks on "signin" button
	Then User should land on Dashbpad page

#@Scenario2
#Scenario: 2 user Should not Be Able To Login With inValid Credentials 
#	Given User is on the TechFios login page 
#	When User enters username as "demo@techfios.com"
#	When User enters password as "abc124"
#	When User clicks on signin button
#	Then User should land on Dashbpad page
#
#@Scenario3	
#Scenario: 3 user Should not Be Able To Login With in Valid Credentials 
#	Given User is on the TechFios login page 
#	When User enters username as "demo2@techfios.com"
#	When User enters password as "abc123"
#	When User clicks on signin button
#	Then User should land on Dashbpad page
#	
#	
	#@OtherScenario2  
#Scenario: 2 user Should not Be Able To Login With inValid Credentials 
#	Given User is on the TechFios login page 
#	When User enters username as "demo@techfios.com"
#	When User enters password as "abc124"
#	When User clicks on signin button
#	Then User should land on Dashbpad page
#
#@OtherScenario3	
#Scenario: 3 user Should not Be Able To Login With in Valid Credentials 
#	Given User is on the TechFios login page 
#	When User enters username as "demo2@techfios.com"
#	When User enters password as "abc123"
#	When User clicks on signin button
#	Then User should land on Dashbpad page
#	
#	
#	@OtherScenario4
#Scenario: 4 user Should not Be Able To Login With in Valid Credentials 
#	Given User is on the TechFios login page 
#	When User enters username as "demo2@techfios.com"
#	When User enters password as "abc124"
#	When User clicks on signin button
#	Then User should land on Dashbpad page