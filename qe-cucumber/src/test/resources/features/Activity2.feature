# Created by AzamMustufaDidagur at 2/4/2026
  @Activity2
Feature: Login Test
  # Enter feature description here

  Scenario: Testing Login
    Given The user is on the login page
    When The user enters username and password
    And Clicks the submit btn
    Then Get the confirmation message and verify it