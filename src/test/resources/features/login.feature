Feature: login

  Scenario: Successfully logged in
    Given I am already on log in page
    When I input username "standard_user"
    And I Input password "secret_sauce"
    And I click login button
    Then I redirected to inventory page

  Scenario: Fail logged in
    Given I am already on log in page
    When I input username "not_standar"
    And I Input password "secret_sauce2"
    And I click login button
    Then error message "can not logged in"