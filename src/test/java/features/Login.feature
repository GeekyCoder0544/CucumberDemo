Feature: Application Login



Scenario: Home page default login
Given User is on NetBanking Landing page
When User Login into application with username and password
Then Home page is populated
And Cards are displayed
