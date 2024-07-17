Feature: Login Page Feature

Scenario: Login Page Titile
Given user is on the login page
When user checks the title of the page
Then page title should be "Login"

Scenario: Forgot password link
Given user is on the login page
Then forgot passowrd link should be displayed

Scenario: Valid login
Given user is on the login page
When user enters the username "Admin"
And user enters the password "admin123"
And user clicks on Login button
Then user should be directed to the "Dashboard" page