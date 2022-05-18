@LoginFeature @Regression
Feature: Techfios Billing login Functionality Validation

Background:
Given User is on techfios login page
@Scenario1 @Smoke
Scenario: Login with valid credetials (other)
When User enters username as "demo@techfios.com"
When User enters password as "abc123"
When User clicks on signin button
Then User should land on dashboard page




@Scenario2
Scenario: Login with invalid credetials (other)
When User enters username as "demo2@techfios.com"
When User enters password as "abc123"
When User clicks on signin button
Then User should not land on dashboard page