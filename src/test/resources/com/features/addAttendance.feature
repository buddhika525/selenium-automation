Feature: Add Attendance

Scenario: Add attendance data
Given user is on the login page
When user enters the username "Admin"
And user enters the password "admin123"
And user clicks on Login button
And user should be directed to the "Dashboard" page
And user clicks on watchIcon
And user sets Punch In time as "8:30 am"
And user sets Punch Out time as "5:00 pm"
Then user checks time at work in Dashboard to be "8h 30m Today"