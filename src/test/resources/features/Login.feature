@login
  Feature: Login

    Scenario Outline: Login with correct credentials
      Given I open Login page
      And I go to login page
      When I type email: "<email>"
      And I type password: "<password>"
      And click login button
      Then I successfully logged in
      Examples:
        |email|password|
      |    athena@olx.com |123456|

