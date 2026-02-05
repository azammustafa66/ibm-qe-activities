# Created by Azam Mustufa Didagur at 2/5/2026
  @Activity4
Feature: Login Test
  # Enter feature description here

  Scenario: Testing Login without examples
    Given The user is on the login page
    When The user enters username and password
    And Clicks the submit btn
    Then Get the confirmation message and verify the message as "Welcome Back, Admin!"