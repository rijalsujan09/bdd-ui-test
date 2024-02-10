# Author: rijalsujan09
# Description: feature to test login functionality in OSS
Feature: feature to test the login functionality in OSS

  Scenario Outline: check login is successful with valid credentials
    Given open browser
    Given user is on loginPage
    When user enters <username> and <password>
    And click on login button
    Then user is navigated to the dashboard

    Examples: 
      | username | password |
      | *******  | ******** |
