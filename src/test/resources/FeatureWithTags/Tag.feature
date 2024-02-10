#Author: rijalsujan09
Feature: feature to test google search functionality

  @smoke
  Scenario: Validate google search is working
    Given browser is open
    And user is on  google search page
    When user enters a text in search box
    And hit enter
    Then user is navigated to search results

  @regression
  Scenario: Validate google search is working
    Given browser is open
    And user is on  google search page
    When user enters a text in search box
    And hit enter
    Then user is navigated to search results

  @important
  Scenario Outline: check login is successful with valid credentials
    Given open browser
    Given user is on loginPage
    When user enters <username> and <password>
    And click on login button
    Then user is navigated to the dashboard

    Examples: 
      | username          | password     |
      | srijal@castera.io | Nunarijal12# |
