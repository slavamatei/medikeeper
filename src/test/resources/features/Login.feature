@Login

Feature: This feature will be testing a successful login

  Scenario: Verifying User can successfully login

    Given User is on the login page
    When  User sends username and password on MediKeeper website
    And User clicks submit on MediKeeper website
    Then User should be redirected to Questionnaire page



