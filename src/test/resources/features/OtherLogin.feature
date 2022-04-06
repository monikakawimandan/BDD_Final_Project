#Author: monikakawimandan@gmail.com
#Keywords Summary : Other Feature Login Test


Feature: Other TechFios Login Functionality validation 

Background: 
Given User is on the TechFios login page 
Then User should land on Dashbpad page

@OtherScenario1
Scenario Outline: user Should Be Able To Login With Valid Credentials 
	Given User is on the TechFios login page 
	When User enters username as "<username>"
	When User enters password as "<password>"
	When User clicks on signin button
	Then User should land on Dashbpad page

Examples: 
        | username |  password |
        |demo@techfios.com | abc123 |
        |demo@techfios.com | abc124 |
        |demo2@techfios.com | abc123 |
        |demo2@techfios.com | abc124 |