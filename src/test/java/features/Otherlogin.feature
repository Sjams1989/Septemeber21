@OtherLoginFeature @Regression
Feature: Techfios Billing other login Functionality Validation

Background:
Given User is on techfios login page






@OtherScenario1
Scenario Outline: Login with invalid username (other)
When User enters username as "<username>"
When User enters password as "<password>"
When User clicks on signin button
Then User should not land on dashboard page

Examples:
|username|password|
|demo2@techfios.com|abc123|
|demo@techfios.com|abc124|
|demo2@techfios.com|abc124|

#@OtherScenario1
#Scenario: Login with invalid username (other)
#When User enters username as "demo2@techfios.com"
#When User enters password as "abc123"
#When User clicks on signin button
#Then User should not land on dashboard page


#@OtherScenario2 @Smoke
#Scenario: Login with invalid password (other)
#When User enters username as "demo@techfios.com"
#When User enters password as "abc124"
#When User clicks on signin button
#Then User should not land on dashboard page


#@OtherScenario2 @Smoke
#Scenario: Login with invalid username and password (other)
#When User enters username as "demo2@techfios.com"
#When User enters password as "abc124"
#When User clicks on signin button
#Then User should not land on dashboard page