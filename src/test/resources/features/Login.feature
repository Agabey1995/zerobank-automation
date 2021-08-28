
Feature: User login

  Scenario: Only authorized users should be able to login to the application
    Given user is on the login page
    When user credentials are correct
    Then user should be able to login


#  Scenario: Account Summary Title Assertion
#    Given the user is on {dashboard page}
#    Then user should see {title}
#
#  Scenario: Showing titles
#    Given the user is on Account Summary
#    Then user should see:
#      | Cash Accounts       |
#      | Investment Accounts |
#      | Credit Accounts     |
#      | Loan Accounts       |
#    And {Credit Accounts} should have:
#    | Account | Credit Card| Balance|






