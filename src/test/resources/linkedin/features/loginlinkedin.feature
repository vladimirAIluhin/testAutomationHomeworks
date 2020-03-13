Feature: User can log in linkedin
  Background:
    Given linkedin login page is opened
  Scenario: as a user I want to be able to log in linkedin
    When user "lemav92498@newe-mail.com" with password "11111q" log in
    Then user logged in a linkedin