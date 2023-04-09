Feature: All registration related scenarios

  @enquiry @nonlogin
  Scenario: To test functionality of submit button for enquiry page
    Given I am on user enquiry page
    When I enter below data
      | Aditi | aditi@gmail.com | 9900099000 | Pune | Tell me more |  |
    And I click on submit
    Then enquiry should be submitted

@userRegistration @nonlogin
  Scenario Outline: To test functionality of submit button for user registration page
    Given I am on user registration page
    When I enter <name>,<email>,<phone>
    And I click on register
    Then user should be added
  Examples:
    | name    | email             | phone |
    | Pradeep | Pradeep@gmail.com | 777   |
    | Rama    | Rama@gmail.com    | 88    |
    | Ramya   | Ramya@gmail.com   | 11    |
    | Rutuja  | Rutuja@gmail.com  | 99    |


