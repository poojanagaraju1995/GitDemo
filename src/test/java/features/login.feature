Feature: Application login

  Scenario: Home page default login
    Given user is on landing page
    When user enters "John" and "password"
    Then page is populated
    And cards displayed are "true"

  Scenario: Home page default login
    Given user is on landing page
    When user enters "one" and "password"
    Then page is populated
    And cards displayed are "false"
