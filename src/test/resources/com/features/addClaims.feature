Feature: Add Attendance

Scenario: Add attendance data
Given user is on the login page
When user enters the username "Admin"
And user enters the password "admin123"
And user clicks on Login button
And user should be directed to the "Dashboard" page
And user clicks on claim menu
And user clicks on Assign claims button
And user selects "Timothy Lewis Amiano" as the employee name
And user selects "Accommodation" as Event
And user selects "United States Dollar" as Currency
And User clicks on create button
#Then User should be moved to "Assign Claim" page