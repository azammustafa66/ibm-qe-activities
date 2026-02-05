# Created by Azam Mustufa Didagur at 2/4/2026
Feature: Application Login
  # Enter feature description here

  Scenario: Admin Page Default Login
    Given User is on NetBanking landing page
    When User logs into the app
    Then Home Page is displayed
    And Cards are displayed