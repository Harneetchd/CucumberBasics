Feature: Login Scenarios of SalesForce Application

Scenario Outline: Login into Saleforce Application with valid usernme and valid password.
Given User launch the Salesforce Application
When User enters username "<username>"
Then User enters password "<password>"
And User clicks on login

Examples:
|username|password|
|harneetkaur@capitalforce.com|Benihina1018@|
|jnanesh.m@tekarch|Test123|