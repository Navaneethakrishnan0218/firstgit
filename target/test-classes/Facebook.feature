Feature: verify facebook login functionality 

Scenario Outline: verify login functionality for valid username

Given  User is a Facebook Login page
When User enters "<username>" and "<password>"
And User clicks the login button
Then Error is displayed
 
 Examples:
     | username| password|
     | User1 | Test123 |#Valid username,invalid password
     | User2 | Test234 |#invalid username,valid password
     | User3 | Test345 |#invalid username,invalid password
     | User4 | Test579 |#valid username,valid password