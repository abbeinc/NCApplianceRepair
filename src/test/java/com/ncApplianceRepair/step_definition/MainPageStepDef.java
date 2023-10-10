package com.ncApplianceRepair.step_definition;

import com.ncApplianceRepair.pages.MainPage;
import com.ncApplianceRepair.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPageStepDef {
    MainPage mainPage = new MainPage();

    @Given("user at the main page")
    public void user_at_the_main_page() {
        MainPage.goToMainPage();

    }
    @When("user click Schedule a Repair")
    public void user_click_schedule_a_repair() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(mainPage.scheduleARepair).click().perform();

    }
    @Then("user should see Schedule Service page")
    public void user_should_see_schedule_service_page() {

        String expectedUrl = "https://ncappliancerepair.com/schedule-service/";
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofMillis(5000));
       wait.until(ExpectedConditions.urlMatches(expectedUrl));
        Assert.assertEquals(expectedUrl, Driver.getDriver().getCurrentUrl());

    }

    @When("user click We Repair and then choose from the drop menu Refrigerator Repair")
    public void userClickWeRepairAndThenChooseFromTheDropMenuRefrigeratorRepair() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(mainPage.weRepair).click().perform();
        actions.moveToElement(mainPage.refrigeratorRepair).click().perform();
    }

    @Then("user should see Refrigerator Repair page")
    public void userShouldSeeRefrigeratorRepairPage() {
        String expectedTitle = "Refrigerator Repair - NC Appliance Repair";
        String expectedUrl = "https://ncappliancerepair.com/refrigerator-service/";
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofMillis(5000));
        wait.until(ExpectedConditions.urlMatches(expectedUrl));
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());

    }

    @When("user click We Repair and then choose from the drop menu Washer Repair")
    public void userClickWeRepairAndThenChooseFromTheDropMenuWasherRepair() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(mainPage.weRepair).click().perform();
        actions.moveToElement(mainPage.washerRepair).click().perform();
    }

    @Then("user should see Washer Repair page")
    public void userShouldSeeWasherRepairPage() {
        String expectedTitle = "Washer repair service - NC Appliance Repair";
        String expectedUrl = "https://ncappliancerepair.com/washer-service/";
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofMillis(5000));
        wait.until(ExpectedConditions.urlMatches(expectedUrl));
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());

    }


    @When("user click We Repair and then choose from the drop menu dishwasher Repair")
    public void userClickWeRepairAndThenChooseFromTheDropMenuDishwasherRepair() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(mainPage.weRepair).click().perform();
        actions.moveToElement(mainPage.dishwasherRepair).click().perform();
    }

    @Then("user should see dishwasher Repair page")
    public void userShouldSeeDishwasherRepairPage() {
        String expectedTitle = "Dishwasher repair service - NC Appliance Repair";
        String expectedUrl = "https://ncappliancerepair.com/dishwasher-service/";
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofMillis(5000));
        wait.until(ExpectedConditions.urlMatches(expectedUrl));
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }

    @When("user click We Repair and then choose from the drop menu Dryer Repair")
    public void userClickWeRepairAndThenChooseFromTheDropMenuDryerRepair() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(mainPage.weRepair).click().perform();
        actions.moveToElement(mainPage.dryerRepair).click().perform();
    }

    @Then("user should see dishwasher Dryer page")
    public void userShouldSeeDishwasherDryerPage() {
        String expectedTitle = "Dryer repair service - NC Appliance Repair";
        String expectedUrl = "https://ncappliancerepair.com/dryer-service/";
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofMillis(5000));
        wait.until(ExpectedConditions.urlMatches(expectedUrl));
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }

    @When("user click We Repair and then choose from the drop menu Oven & Range Repair")
    public void userClickWeRepairAndThenChooseFromTheDropMenuOvenRangeRepair() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(mainPage.weRepair).click().perform();
        actions.moveToElement(mainPage.ovenAndRangeRepair).click().perform();
    }

    @Then("user should see dishwasher Oven & Range page")
    public void userShouldSeeDishwasherOvenRangePage() {
        String expectedTitle = "xpert Oven and Range Repair Service: Troubleshooting Tips, FAQs, and Reliable Solutions - NC Appliance Repair";
        String expectedUrl = "https://ncappliancerepair.com/oven-range-service/";
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofMillis(5000));
        wait.until(ExpectedConditions.urlMatches(expectedUrl));
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }

    @When("user click Service Area and then choose from the drop menu Appliance repair Charlotte")
    public void userClickServiceAreaAndThenChooseFromTheDropMenuApplianceRepairCharlotte() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(mainPage.serviceArea).pause(1).moveToElement(mainPage.charlotteArea).click().perform();
    }

    @Then("user should see  page Appliance repair Charlotte NC")
    public void userShouldSeePageApplianceRepairCharlotteNC() {
        String expectedTitle = "Appliance repair Charlotte - service by NC Appliance Repair";
        String expectedUrl = "https://ncappliancerepair.com/service-area/appliance-repair-charlotte-nc/";
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofMillis(5000));
        wait.until(ExpectedConditions.urlMatches(expectedUrl));
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }

    @When("user click Service Area and then choose from the drop menu Appliance repair Matthews")
    public void userClickServiceAreaAndThenChooseFromTheDropMenuApplianceRepairMatthews() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(mainPage.serviceArea).pause(1).moveToElement(mainPage.matthewsArea).click().perform();
    }

    @Then("user should see  page Appliance repair Matthews NC")
    public void userShouldSeePageApplianceRepairMatthewsNC() {
        String expectedTitle = "Appliance Repair in Matthews NC - Trusted Service Company";
        String expectedUrl = "https://ncappliancerepair.com/service-area/appliance-repair-matthews-nc/";
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofMillis(5000));
        wait.until(ExpectedConditions.urlMatches(expectedUrl));
        String actualTitle = Driver.getDriver().getTitle();
        actualTitle = actualTitle.substring(actualTitle.indexOf("A"));
        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @When("user click Service Area and then choose from the drop menu Appliance repair Monroe")
    public void userClickServiceAreaAndThenChooseFromTheDropMenuApplianceRepairMonroe() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(mainPage.serviceArea).pause(1).moveToElement(mainPage.monroeArea).click().perform();
    }

    @Then("user should see  page Appliance repair Monroe NC")
    public void userShouldSeePageApplianceRepairMonroeNC() {
        String expectedTitle = "Appliance Repair Monroe - NC Appliance Repair";
        String expectedUrl = "https://ncappliancerepair.com/service-area/appliance-repair-monroe-nc/";
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofMillis(5000));
        wait.until(ExpectedConditions.urlMatches(expectedUrl));
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());

    }

    @When("user click Service Area and then choose from the drop menu Appliance repair Waxhaw")
    public void userClickServiceAreaAndThenChooseFromTheDropMenuApplianceRepairWaxhaw() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(mainPage.serviceArea).pause(1).moveToElement(mainPage.waxhawArea).click().perform();
    }

    @Then("user should see  page Appliance repair Waxhaw NC")
    public void userShouldSeePageApplianceRepairWaxhawNC() {
        String expectedTitle = "Appliance Repair in Waxhaw NC -Trusted Service Company";
        String expectedUrl = "https://ncappliancerepair.com/service-area/appliance-repair-waxhaw-nc/";
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofMillis(5000));
        wait.until(ExpectedConditions.urlMatches(expectedUrl));
        String actualTitle = Driver.getDriver().getTitle();
        actualTitle = actualTitle.substring(actualTitle.indexOf("A"));
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("user click Service Area and then choose from the drop menu Appliance repair Indian Trail")
    public void userClickServiceAreaAndThenChooseFromTheDropMenuApplianceRepairIndianTrail() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(mainPage.serviceArea).pause(1).moveToElement(mainPage.indianTrailArea).click().perform();
    }

    @Then("user should see  page Appliance repair Indian Trail NC")
    public void userShouldSeePageApplianceRepairIndianTrailNC() {
        String expectedTitle = "#1 Appliance Repair Indian Trail - Expert Appliance Service";
        String expectedUrl = "https://ncappliancerepair.com/service-area/appliance-repair-indian-trail-nc/";
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofMillis(5000));
        wait.until(ExpectedConditions.urlMatches(expectedUrl));
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }
}
