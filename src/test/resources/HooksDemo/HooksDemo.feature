#Author: rijalsujan09

Feature: Check login functionality
  
  Scenario: Test if login is sucessfull
    Given user is on login page
    When enter valid username and password
    And click login button
    Then user is navigated to the home page

