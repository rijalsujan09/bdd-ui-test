# Author: rijalsujan09
# Description: feature to test login functionality in BSS


Feature: feature to test the login functionality in BSS

  Scenario: check login is successful with valid credentials

    Given open browser
    Given user is on loginPage
    When user enters username and password
    And click on login button
    Then user is navigated to the dashboard
