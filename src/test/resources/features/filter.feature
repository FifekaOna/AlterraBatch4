Feature: Filter

  Scenario Outline: Filter items
    Given I Already logged in
    When I click filter by "<Filter>"
    Then Item should be filtered by "<Filter>"
    Examples:
      |Filter|
      |Name (A to Z)|