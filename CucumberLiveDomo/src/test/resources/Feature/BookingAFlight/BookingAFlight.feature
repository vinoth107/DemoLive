#Author: greens

Feature: Book A flight oneway

  Scenario: Booking flight in OneWay trip
    Given The User is in Delta homepage
    When The user enters source and destination
      | MAA | MSP |
    And The user select oneway trip
    And The user select date from Web calendar "01/29/2019"
    And The user clicks submit button
    Then The user should be in search results page
