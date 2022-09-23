@Featuretested
Feature: login

  @sanity
  Scenario: Successfully logged in
    Given I am already on log in page
    When I input username "standard_user"
    And I Input password "secret_sauce"
    And I click login button
    Then I redirected to inventory page

  @regression
  Scenario Outline: Add an item to cart
    Given I Already logged in
    When I select item "<item>"
    Then "<item>" will be added to cart
    Examples:
      | item                                   |
      | "add-to-cart-sauce-labs-fleece-jacket" |


  @sanity
  Scenario Outline: Successfully logged in
    Given I am already on log in page
    When I input usernameasa "<User>"
    And I Input password "<Password>"
    And I click login button
#    Then I redirected to inventory page
    Examples:
      | User            | Password     |
      | standard_user   | secret_sauce |
      | locked_out_user | secret_sauce |


  Scenario Outline: Filter items
    Given I Already logged in
    When I click sort by "<Filter>"
    Then Item should be filtered by "<Filter>"
    Examples:
      | Filter              |
      | Price (low to high) |

  Scenario Outline: Filter items by value
    Given I Already logged in
    When I click sort by "<value>"
    Then Item should be filtered by "<Filter>"
    Examples:
      |value| Filter              |
      |lohi | Price (low to high) |