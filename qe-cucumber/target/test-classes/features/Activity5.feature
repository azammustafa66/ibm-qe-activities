# Created by AzamMustufaDidagur at 2/5/2026
@Activity5
Feature: Login Test
  # Enter feature description here

  Scenario Outline: Login Test with Example
    Given The user is on the login page
    When The user enters "<username>" and "<password>"
    When Clicks the submit btn
    Then Get the confirmation text and verify the message as "Invalid credentials"
    Examples:
      | username | password |
      | admin    | admin    |
      | admin    | pass     |
      | admin    | pass123  |
