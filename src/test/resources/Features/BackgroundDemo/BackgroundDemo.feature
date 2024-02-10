Feature: check home page functionaltiy

  Background: user is logged in
    Given on login page
    When enter username and password
    And click login button
    Then user is on home page

  Scenario: check logout link
    When user clicks on logout button
    Then logout button is displyed

  Scenario: verify dashboard is present
    When user clicks on dashboard link
    Then quick launch widget is displayed
