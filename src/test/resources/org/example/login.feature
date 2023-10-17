Feature: Login

  Scenario: Login as an common user and as a default mandator
    Given Open login page
    When Login as 'username' user and set a default mandator
    Then User has been logged
