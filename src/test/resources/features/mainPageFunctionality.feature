@regression
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
    When user click We Repair and then choose from the drop menu Dishwasher Repair
    Then user should see Dishwasher Repair page


  Scenario: user should be able to choose from We Repair (Dryer Repair)
    When user click We Repair and then choose from the drop menu Dryer Repair
    Then user should see Dryer Repair page


  Scenario: user should be able to choose from We Repair (Oven & Range Repair)
    When user click We Repair and then choose from the drop menu Oven & Range Repair
    Then user should see Oven & Range page


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


  Scenario: user should be able to choose from Service Area (Appliance repair Indian Trail)
    When user click Service Area and then choose from the drop menu Appliance repair Indian Trail
    Then user should see  page Appliance repair Indian Trail NC

  Scenario: user should be able to click Refrigerator Repair Pic and reach Refrigerator Repair page
    When user click Refrigerator Repair Pic.
    Then user should see Refrigerator Repair page


  Scenario: user should be able to click Washer Repair Pic and reach Washer Repair page
    When user click Washer Repair Pic.
    Then user should see Washer Repair page


  Scenario: user should be able to click Range & Oven Repair Pic and reach Range & Oven Repair Repair page
    When user click Range & Oven Repair Pic
    Then user should see Oven & Range page

  Scenario: user should be able to Dryer Repair Pic and reach Dryer Repair page
    When user click Dryer Repair Pic
    Then user should see Dryer Repair page


  Scenario: user should be able to Dishwasher Repair Pic and reach Dishwasher Repair page
    When user click Dishwasher Repair Pic
    Then user should see Dishwasher Repair page


  Scenario: user should be able to Microwave Repair Pic and reach Microwave Repair page
    When user click Microwave Repair Pic
    Then user should see Microwave Repair page

    Scenario: by clicking button Schedule Repair at the very end of page user should be redirected to the Schedule a Service page
      When user click Schedule a Repair button
      Then user should see Schedule Service page


    Scenario: User should be able to reach location by clicking links at the very bottom of the page
    When user scroll all the way and click Appliance repair Charlotte
    Then user should see  page Appliance repair Charlotte NC


  Scenario: User should be able to reach location by clicking links at the very bottom of the page
    When user scroll all the way and click Appliance repair Matthews
    Then user should see  page Appliance repair Matthews NC


  Scenario: User should be able to reach location by clicking links at the very bottom of the page
    When user scroll all the way and click Appliance repair Monroe
    Then user should see  page Appliance repair Monroe NC

  Scenario: User should be able to reach location by clicking links at the very bottom of the page
    When user scroll all the way and click Appliance repair Waxhaw
    Then user should see  page Appliance repair Waxhaw NC


  Scenario: User should be able to reach location by clicking links at the very bottom of the page
    When user scroll all the way and click Appliance repair Indian Trail
    Then user should see  page Appliance repair Indian Trail NC