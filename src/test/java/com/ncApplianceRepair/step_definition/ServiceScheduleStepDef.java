package com.ncApplianceRepair.step_definition;

import com.github.javafaker.Faker;
import com.ncApplianceRepair.pages.MainPage;
import com.ncApplianceRepair.pages.ScheduleARepairPage;
import com.ncApplianceRepair.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ServiceScheduleStepDef {


    ScheduleARepairPage scheduleARepairPage = new ScheduleARepairPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofMillis(5000));
    Faker faker = new Faker();
    MainPage mainPage = new MainPage();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


    @Given("User at the Service Schedule page")
    public void userAtTheServiceSchedulePage() {
        MainPage.goToMainPage();
        js.executeScript("document.body.style.transform = 'scale(0.5)';");
        actions.moveToElement(mainPage.scheduleARepair).click().perform();
    }

    @When("user fill up page one of a Service Schedule with a {string} for the refrigerator and fill up page two of a Service Schedule")
    public void userFillUpPageOneOfAServiceScheduleWithAForTheRefrigeratorAndFillUpPageTwoOfAServiceSchedule(String str) {

        js.executeScript("document.body.style.transform = 'scale(0.5)';");
        js.executeScript("window.scrollBy(0,500)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.zipCode));
        scheduleARepairPage.zipCode.sendKeys(str);
        js.executeScript("window.scrollBy(0,300)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.refrigeratorCheckBox));
        actions.moveToElement(scheduleARepairPage.refrigeratorCheckBox).click().perform();
        js.executeScript("window.scrollBy(0,300)");
        actions.moveToElement(scheduleARepairPage.topFreezer).click().perform();
        js.executeScript("window.scrollBy(0,300)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.whirlpoolBrand));
        scheduleARepairPage.whirlpoolBrand.click();
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.notCooling));
        actions.moveToElement(scheduleARepairPage.notCooling).click().pause(2).perform();
        js.executeScript("window.scrollBy(0,300)");
        actions.moveToElement(scheduleARepairPage.buttonNext).click().perform();
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.nameSecondPage));
        scheduleARepairPage.nameSecondPage.sendKeys(faker.name().fullName());
        scheduleARepairPage.phoneSecondPage.sendKeys(faker.phoneNumber().cellPhone());
        scheduleARepairPage.emailSecondPage.sendKeys(faker.name().firstName() + "@gmail.com");
        scheduleARepairPage.phoneCheckBox.click();
        js.executeScript("window.scrollBy(0,300)");
        scheduleARepairPage.addressSecondPage.sendKeys(faker.address().fullAddress());
        scheduleARepairPage.availabilityMorning.click();
        js.executeScript("window.scrollBy(0,300)");
        //scheduleARepairPage.submitButton.submit();
    }

    @Then("user will see page Request was submitted")
    public void userWillSeePageRequestWasSubmitted() {
        js.executeScript("document.body.style.transform = 'scale(0.5)';");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.submitButton));
        Assert.assertTrue(scheduleARepairPage.submitButton.isDisplayed());
    }

    @When("user fill up page one of a Service Schedule with a {string} for the washer and fill up page two of a Service Schedule")
    public void userFillUpPageOneOfAServiceScheduleWithAForTheWasherAndFillUpPageTwoOfAServiceSchedule(String str) {
        js.executeScript("document.body.style.transform = 'scale(0.5)';");
        js.executeScript("window.scrollBy(0,500)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.zipCode));
        scheduleARepairPage.zipCode.sendKeys(str);
        js.executeScript("window.scrollBy(0,300)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.washer));
        actions.moveToElement(scheduleARepairPage.washer).click().perform();
        js.executeScript("window.scrollBy(0,300)");
        actions.moveToElement(scheduleARepairPage.frontLoad).click().perform();
        js.executeScript("window.scrollBy(0,300)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.whirlpoolBrand));
        scheduleARepairPage.whirlpoolBrand.click();
        js.executeScript("window.scrollBy(0,300)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.notDraining));
        actions.moveToElement(scheduleARepairPage.notDraining).click().perform();
        js.executeScript("window.scrollBy(0,300)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.buttonNext));
        actions.moveToElement(scheduleARepairPage.buttonNext).click().perform();
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.nameSecondPage));
        scheduleARepairPage.nameSecondPage.sendKeys(faker.name().fullName());
        scheduleARepairPage.phoneSecondPage.sendKeys(faker.phoneNumber().cellPhone());
        scheduleARepairPage.emailSecondPage.sendKeys(faker.name().firstName() + "@gmail.com");
        actions.pause(500).perform();
        scheduleARepairPage.phoneCheckBox.click();
        js.executeScript("window.scrollBy(0,300)");
        scheduleARepairPage.addressSecondPage.sendKeys(faker.address().fullAddress());
        js.executeScript("window.scrollBy(0,100)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.availabilityMorning));
        actions.moveToElement(scheduleARepairPage.availabilityMorning).click().perform();
        js.executeScript("window.scrollBy(0,100)");
        //scheduleARepairPage.submitButton.submit();
    }

    @When("user fill up page one of a Service Schedule with a {string} for the dryer and fill up page two of a Service Schedule")
    public void userFillUpPageOneOfAServiceScheduleWithAForTheDryerAndFillUpPageTwoOfAServiceSchedule(String str) throws InterruptedException {
        js.executeScript("document.body.style.transform = 'scale(0.5)';");
        js.executeScript("window.scrollBy(0,500)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.zipCode));
        scheduleARepairPage.zipCode.sendKeys(str);
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.dryer));
        actions.moveToElement(scheduleARepairPage.dryer).click().perform();
        js.executeScript("window.scrollBy(0,500)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.dryerTypeGas));
        actions.moveToElement(scheduleARepairPage.dryerTypeGas).click().perform();
        js.executeScript("window.scrollBy(0,300)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.kenmoreBrand));
        actions.moveToElement(scheduleARepairPage.kenmoreBrand).click().perform();
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.dryerNoisyIssue));
        actions.moveToElement(scheduleARepairPage.dryerNoisyIssue).click().perform();
        js.executeScript("window.scrollBy(0,300)");
        actions.moveToElement(scheduleARepairPage.buttonNext).click().pause(100).perform();
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.nameSecondPage));
        scheduleARepairPage.nameSecondPage.sendKeys(faker.name().fullName());
        scheduleARepairPage.phoneSecondPage.sendKeys(faker.phoneNumber().cellPhone());
        scheduleARepairPage.emailSecondPage.sendKeys(faker.name().firstName() + "@gmail.com");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.textCheckBox));
        actions.pause(1000).perform();
        actions.click(scheduleARepairPage.textCheckBox).perform();
        scheduleARepairPage.addressSecondPage.sendKeys(faker.address().fullAddress());
        js.executeScript("window.scrollBy(0,100)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.availabilityMorning));
        actions.moveToElement(scheduleARepairPage.availabilityMorning).click().perform();
        js.executeScript("window.scrollBy(0,500)");
        //scheduleARepairPage.submitButton.submit();

    }

    @When("user fill up page one of a Service Schedule with a {string} for the dishwasher and fill up page two of a Service Schedule")
    public void userFillUpPageOneOfAServiceScheduleWithAForTheDishwasherAndFillUpPageTwoOfAServiceSchedule(String str) throws InterruptedException {
        js.executeScript("document.body.style.transform = 'scale(0.5)';");

        js.executeScript("window.scrollBy(0,500)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.zipCode));
        scheduleARepairPage.zipCode.sendKeys(str);
        js.executeScript("window.scrollBy(0,300)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.dishwasher));
        actions.moveToElement(scheduleARepairPage.dishwasher).click().pause(100).perform();
        js.executeScript("window.scrollBy(0,100)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.kitchenAidBrand));
        actions.moveToElement(scheduleARepairPage.kitchenAidBrand).click().pause(100).perform();
        js.executeScript("window.scrollBy(0,300)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.dishwasherLeakingIssue));
        actions.moveToElement(scheduleARepairPage.dishwasherLeakingIssue).click().pause(100).perform();
        js.executeScript("window.scrollBy(0,300)");
        actions.moveToElement(scheduleARepairPage.buttonNext).click().pause(100).perform();
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.nameSecondPage));
        scheduleARepairPage.nameSecondPage.sendKeys(faker.name().fullName());
        scheduleARepairPage.phoneSecondPage.sendKeys(faker.phoneNumber().cellPhone());
        scheduleARepairPage.emailSecondPage.sendKeys(faker.name().firstName() + "@gmail.com");
        actions.pause(500).perform();
        actions.click(scheduleARepairPage.textCheckBox).pause(1000).perform();
        scheduleARepairPage.addressSecondPage.sendKeys(faker.address().fullAddress());
        js.executeScript("window.scrollBy(0,100)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.availabilityAfternoon));
        actions.moveToElement(scheduleARepairPage.availabilityAfternoon).click().pause(100).perform();
        js.executeScript("window.scrollBy(0,100)");
//        //scheduleARepairPage.submitButton.submit();
//

    }

    @When("user fill up page one of a Service Schedule with a {string} for the oven and fill up page two of a Service Schedule")
    public void userFillUpPageOneOfAServiceScheduleWithAForTheOvenAndFillUpPageTwoOfAServiceSchedule(String str) throws InterruptedException {
        js.executeScript("document.body.style.transform = 'scale(0.5)';");

        js.executeScript("window.scrollBy(0,500)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.zipCode));
        scheduleARepairPage.zipCode.sendKeys(str);
        js.executeScript("window.scrollBy(0,500)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.oven));
        actions.moveToElement(scheduleARepairPage.oven).click().perform();
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.ovenTypeMicrowaveCombo));
        actions.click(scheduleARepairPage.ovenTypeMicrowaveCombo).perform();
        js.executeScript("window.scrollBy(0,100)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.amanaBrand));
        actions.moveToElement(scheduleARepairPage.amanaBrand).click().pause(100).perform();
        js.executeScript("window.scrollBy(0,300)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.ovenDoorLockedIssue));
        actions.moveToElement(scheduleARepairPage.ovenDoorLockedIssue).click().pause(100).perform();
        js.executeScript("window.scrollBy(0,300)");
        actions.moveToElement(scheduleARepairPage.buttonNext).click().pause(100).perform();
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.nameSecondPage));
        scheduleARepairPage.nameSecondPage.sendKeys(faker.name().fullName());
        scheduleARepairPage.phoneSecondPage.sendKeys(faker.phoneNumber().cellPhone());
        scheduleARepairPage.emailSecondPage.sendKeys(faker.name().firstName() + "@gmail.com");
        actions.pause(500).perform();
        actions.moveToElement(scheduleARepairPage.textCheckBox).click().perform();
        scheduleARepairPage.addressSecondPage.sendKeys(faker.address().fullAddress());
        js.executeScript("window.scrollBy(0,100)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.availabilityAfternoon));
        actions.moveToElement(scheduleARepairPage.availabilityAfternoon).click().pause(100).perform();
        js.executeScript("window.scrollBy(0,100)");
        //scheduleARepairPage.submitButton.submit();

    }

    @When("user fill up page one of a Service Schedule with a {string} for the range and fill up page two of a Service Schedule")
    public void userFillUpPageOneOfAServiceScheduleWithAForTheRangeAndFillUpPageTwoOfAServiceSchedule(String str) {
        js.executeScript("document.body.style.transform = 'scale(0.5)';");

        js.executeScript("window.scrollBy(0,500)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.zipCode));
        scheduleARepairPage.zipCode.sendKeys(str);
        js.executeScript("window.scrollBy(0,300)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.range));
        actions.moveToElement(scheduleARepairPage.range).click().perform();
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.rangeTypeDualFuel));
        actions.click(scheduleARepairPage.rangeTypeDualFuel).perform();
        js.executeScript("window.scrollBy(0,300)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.hotpointBrand));
        actions.moveToElement(scheduleARepairPage.hotpointBrand).click().pause(100).perform();
        js.executeScript("window.scrollBy(0,300)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.rangeBakeNotHeatingIssue));
        actions.moveToElement(scheduleARepairPage.rangeBakeNotHeatingIssue).click().pause(100).perform();
        js.executeScript("window.scrollBy(0,300)");
        actions.moveToElement(scheduleARepairPage.buttonNext).click().pause(100).perform();
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.nameSecondPage));
        scheduleARepairPage.nameSecondPage.sendKeys(faker.name().fullName());
        scheduleARepairPage.phoneSecondPage.sendKeys(faker.phoneNumber().cellPhone());
        scheduleARepairPage.emailSecondPage.sendKeys(faker.name().firstName() + "@gmail.com");
        actions.pause(500).perform();
        actions.moveToElement(scheduleARepairPage.textCheckBox).click().perform();
        scheduleARepairPage.addressSecondPage.sendKeys(faker.address().fullAddress());
        js.executeScript("window.scrollBy(0,200)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.availabilityAfternoon));
        actions.moveToElement(scheduleARepairPage.availabilityLateAfternoon).click().pause(100).perform();
        js.executeScript("window.scrollBy(0,100)");
        //scheduleARepairPage.submitButton.submit();


    }

    @When("user fill up page one of a Service Schedule with a {string} for the freezer and fill up page two of a Service Schedule")
    public void userFillUpPageOneOfAServiceScheduleWithAForTheFreezerAndFillUpPageTwoOfAServiceSchedule(String str) {
        js.executeScript("document.body.style.transform = 'scale(0.5)';");
        js.executeScript("window.scrollBy(0,500)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.zipCode));
        scheduleARepairPage.zipCode.sendKeys(str);
        js.executeScript("window.scrollBy(0,300)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.freezer));
        actions.moveToElement(scheduleARepairPage.freezer).click().perform();
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.freezerTypeUprightFreezer));
        actions.click(scheduleARepairPage.freezerTypeUprightFreezer).perform();
        js.executeScript("window.scrollBy(0,200)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.subZero));
        actions.click(scheduleARepairPage.subZero).perform();
        js.executeScript("window.scrollBy(0,300)");
        actions.moveToElement(scheduleARepairPage.buttonNext).click().pause(100).perform();
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.nameSecondPage));
        scheduleARepairPage.nameSecondPage.sendKeys(faker.name().fullName());
        scheduleARepairPage.phoneSecondPage.sendKeys(faker.phoneNumber().cellPhone());
        scheduleARepairPage.emailSecondPage.sendKeys(faker.name().firstName() + "@gmail.com");
        actions.pause(500).perform();
        actions.moveToElement(scheduleARepairPage.textCheckBox).click().perform();
        scheduleARepairPage.addressSecondPage.sendKeys(faker.address().fullAddress());
        js.executeScript("window.scrollBy(0,200)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.availabilityAfternoon));
        actions.moveToElement(scheduleARepairPage.availabilityLateAfternoon).click().pause(100).perform();
        js.executeScript("window.scrollBy(0,100)");
        //scheduleARepairPage.submitButton.submit();


    }

    @When("user fill up page one of a Service Schedule with a {string} for the cooktop and fill up page two of a Service Schedule")
    public void userFillUpPageOneOfAServiceScheduleWithAForTheCooktopAndFillUpPageTwoOfAServiceSchedule(String str) {
        js.executeScript("document.body.style.transform = 'scale(0.5)';");
        js.executeScript("window.scrollBy(0,500)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.zipCode));
        scheduleARepairPage.zipCode.sendKeys(str);
        js.executeScript("window.scrollBy(0,300)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.cooktop));
        actions.moveToElement(scheduleARepairPage.cooktop).click().perform();
        js.executeScript("window.scrollBy(0,100)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.cooktopTypeElectric));
        actions.click(scheduleARepairPage.cooktopTypeElectric).perform();
        js.executeScript("window.scrollBy(0,200)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.jennAirBrand));
        actions.click(scheduleARepairPage.jennAirBrand).perform();
        js.executeScript("window.scrollBy(0,300)");
        actions.click(scheduleARepairPage.cooktopConstantClickingNoiseIssue).perform();
        js.executeScript("window.scrollBy(0,100)");
        actions.moveToElement(scheduleARepairPage.buttonNext).click().pause(100).perform();
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.nameSecondPage));
        scheduleARepairPage.nameSecondPage.sendKeys(faker.name().fullName());
        scheduleARepairPage.phoneSecondPage.sendKeys(faker.phoneNumber().cellPhone());
        scheduleARepairPage.emailSecondPage.sendKeys(faker.name().firstName() + "@gmail.com");
        actions.pause(500).perform();
        actions.moveToElement(scheduleARepairPage.textCheckBox).click().perform();
        scheduleARepairPage.addressSecondPage.sendKeys(faker.address().fullAddress());
        js.executeScript("window.scrollBy(0,200)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.availabilityAfternoon));
        actions.moveToElement(scheduleARepairPage.availabilityLateAfternoon).click().pause(100).perform();
        js.executeScript("window.scrollBy(0,100)");


    }
}
