@single
Feature: User should be able to fill up the form and submit

  Background:
    Given User at the Service Schedule page

  Scenario Outline: User should be able to fill up and submit form for refrigerator repair with correct zipcode
    When user fill up page one of a Service Schedule with a "<zipcode>" and fill up page two of a Service Schedule


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