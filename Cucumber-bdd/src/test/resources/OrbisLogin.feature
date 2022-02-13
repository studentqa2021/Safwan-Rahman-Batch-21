@Smoke
Feature: Login Function Test


  @tc001_to_tc005
  Scenario: As an Orbis user, can do a successful login with  valid credential
    Given Open Browser
    And Go to Application URL
    When Put valid username
    And Put valid password
    And Click sumbit button
    Then Login should be successful and show sign out button
    And Close browser 

