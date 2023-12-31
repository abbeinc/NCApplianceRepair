@regression
Feature: User should be able to fill up the form and submit

  Background:
    Given User at the Service Schedule page

  Scenario Outline: User should be able to fill up and submit form for refrigerator repair with correct zipcode
    When user fill up page one of a Service Schedule with a "<zipcode>" for the refrigerator and fill up page two of a Service Schedule


    Then user will see page Request was submitted
    Examples:
      | zipcode |
      | 28079   |
      | 28104   |
      | 28110   |
      | 28104   |
      | 28105   |
      | 28110   |
      | 28112   |
      | 28173   |


  Scenario Outline: User should be able to fill up and submit form for washer repair with correct zipcode
    When user fill up page one of a Service Schedule with a "<zipcode>" for the washer and fill up page two of a Service Schedule


    Then user will see page Request was submitted
    Examples:
      | zipcode |
      | 28079   |
      | 28104   |
      | 28110   |
      | 28104   |
      | 28105   |
      | 28110   |
      | 28112   |
      | 28173   |


  Scenario Outline: User should be able to fill up and submit form for dryer repair with correct zipcode
    When user fill up page one of a Service Schedule with a "<zipcode>" for the dryer and fill up page two of a Service Schedule
    Then user will see page Request was submitted
    Examples:
      | zipcode |
      | 28079   |
      | 28104   |
      | 28110   |
      | 28104   |
      | 28110   |
      | 28112   |
      | 28173   |


  Scenario Outline: User should be able to fill up and submit form for dishwasher repair with correct zipcode
    When user fill up page one of a Service Schedule with a "<zipcode>" for the dishwasher and fill up page two of a Service Schedule
    Then user will see page Request was submitted
    Examples:
      | zipcode |
      | 28079   |
      | 28104   |
      | 28110   |
      | 28104   |
      | 28105   |
      | 28110   |
      | 28112   |
      | 28173   |


  Scenario Outline: User should be able to fill up and submit form for oven repair with correct zipcode
    When user fill up page one of a Service Schedule with a "<zipcode>" for the oven and fill up page two of a Service Schedule
    Then user will see page Request was submitted
    Examples:
      | zipcode |
      | 28079   |
      | 28104   |
      | 28110   |
      | 28104   |
      | 28105   |
      | 28110   |
      | 28112   |
      | 28173   |


  Scenario Outline: User should be able to fill up and submit form for range repair with correct zipcode
    When user fill up page one of a Service Schedule with a "<zipcode>" for the range and fill up page two of a Service Schedule
    Then user will see page Request was submitted
    Examples:
      | zipcode |
      | 28079   |
      | 28104   |
      | 28110   |
      | 28104   |
      | 28105   |
      | 28110   |
      | 28112   |
      | 28173   |

  Scenario Outline: User should be able to fill up and submit form for freezer repair with correct zipcode
    When user fill up page one of a Service Schedule with a "<zipcode>" for the freezer and fill up page two of a Service Schedule
    Then user will see page Request was submitted
    Examples:
      | zipcode |
      | 28079   |
      | 28104   |
      | 28110   |
      | 28104   |
      | 28105   |
      | 28110   |
      | 28112   |
      | 28173   |


  Scenario Outline: User should be able to fill up and submit form for cooktop repair with correct zipcode
    When user fill up page one of a Service Schedule with a "<zipcode>" for the cooktop and fill up page two of a Service Schedule
    Then user will see page Request was submitted
    Examples:
      | zipcode |
      | 28079   |
      | 28104   |
      | 28110   |
      | 28104   |
      | 28105   |
      | 28110   |
      | 28112   |
      | 28173   |