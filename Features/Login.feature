 Feature: All login scenarios

   Background: Before every scenario
     Given I open browser
     And I maximize it

   @login @valid
   Scenario: To test functionality of login button for valid input
     Given I am on login page
    # When I enter correct username and correct password
     When I enter username as "amolujagare@gmail.com" and password "admin123"
     And I click login button
     Then I should be on dashboard

   @login @invalid @notblank
     Scenario: To test functionality of login button for invalid input
       Given I am on login page
     #  When I enter incorrect username and incorrect password
       When I enter username as "xyz@gmail.com" and password "abcd"
       And I click login button
       Then I should get an error

   @login @invalid @blank
   Scenario: To test functionality of login button for blank input
     Given I am on login page
    # When I enter blank username and blank password
     When I enter username as "" and password ""
     And I click login button
     Then I should get another error

   @login @forgotPassword
   Scenario: To test functionality of forgot password button
     Given I am on login page
    # When I enter blank username and blank password
     When I click forgot password button
     Then I should reach to forgot password page