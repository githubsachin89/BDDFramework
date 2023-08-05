Feature: OHRM apllications Tests

  Scenario: Test Orange HRM Login Functinality
    Given User is on orange HRM Login page
    When User Enter valid Username and Password
    Then User is on Home page and validate Title
