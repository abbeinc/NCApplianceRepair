
Feature: User should be able to use main page. All link and button should work properly.
  Background:
    Given user at the main page
  Scenario:
    When user click Schedule a Repair
    Then user should see Schedule Service page

    Scenario: user should be able to choose from We Repair (Refrigerator Repair)
    When user click We Repair and then choose from the drop menu Refrigerator Repair
    Then user should see Refrigerator Repair page

  Scenario: user should be able to choose from We Repair (Washer Repair)
    When user click We Repair and then choose from the drop menu Washer Repair
    Then user should see Washer Repair page

  Scenario: user should be able to choose from We Repair (Dishwasher Repair)
    When user click We Repair and then choose from the drop menu dishwasher Repair
    Then user should see dishwasher Repair page


  Scenario: user should be able to choose from We Repair (Dryer Repair)
    When user click We Repair and then choose from the drop menu Dryer Repair
    Then user should see dishwasher Dryer page


  Scenario: user should be able to choose from We Repair (Oven & Range Repair)
    When user click We Repair and then choose from the drop menu Oven & Range Repair
    Then user should see dishwasher Oven & Range page


  Scenario: user should be able to choose from Service Area (Appliance repair Charlotte)
    When user click Service Area and then choose from the drop menu Appliance repair Charlotte
    Then user should see  page Appliance repair Charlotte NC


  Scenario: user should be able to choose from Service Area (Appliance repair Matthews)
    When user click Service Area and then choose from the drop menu Appliance repair Matthews
    Then user should see  page Appliance repair Matthews NC


  Scenario: user should be able to choose from Service Area (Appliance repair Monroe)
    When user click Service Area and then choose from the drop menu Appliance repair Monroe
    Then user should see  page Appliance repair Monroe NC


  Scenario: user should be able to choose from Service Area (Appliance repair Waxhaw)
    When user click Service Area and then choose from the drop menu Appliance repair Waxhaw
    Then user should see  page Appliance repair Waxhaw NC

  @single
  Scenario: user should be able to choose from Service Area (Appliance repair Indian Trail)
    When user click Service Area and then choose from the drop menu Appliance repair Indian Trail
    Then user should see  page Appliance repair Indian Trail NC