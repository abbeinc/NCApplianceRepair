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
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ServiceScheduleStepDef {


    ScheduleARepairPage scheduleARepairPage = new ScheduleARepairPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofMillis(4000));
    Faker faker = new Faker();
    MainPage mainPage = new MainPage();
            Actions actions = new Actions(Driver.getDriver());

    @Given("User at the Service Schedule page")
    public void userAtTheServiceSchedulePage() {
        MainPage.goToMainPage();
        actions.moveToElement(mainPage.scheduleARepair).click().perform();
    }
     @When("user fill up page one of a Service Schedule with a {string} and fill up page two of a Service Schedule")
    public void userFillUpPageOneOfAServiceScheduleWithAAndFillUpPageTwoOfAServiceSchedule(String str) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,500)");
        scheduleARepairPage.zipCode.sendKeys(str);
        js.executeScript("window.scrollBy(0,500)");
        actions.moveToElement(scheduleARepairPage.refrigeratorCheckBox).click().perform();
        actions.moveToElement(scheduleARepairPage.topFreezer).click().perform();
        scheduleARepairPage.whirlpoolBrand.click();
        js.executeScript("window.scrollBy(0,300)");
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.notCooling));
        actions.moveToElement(scheduleARepairPage.notCooling).click().pause(1).perform();
        js.executeScript("window.scrollBy(0,500)");
        actions.moveToElement(scheduleARepairPage.buttonNext).click().perform();
        wait.until(ExpectedConditions.visibilityOf(scheduleARepairPage.secondPageName));
        scheduleARepairPage.nameSecondPage.sendKeys(faker.name().fullName());
        scheduleARepairPage.phoneSecondPage.sendKeys(faker.phoneNumber().cellPhone());
        scheduleARepairPage.emailSecondPage.sendKeys(faker.name().firstName()+"@gmail.com");
        scheduleARepairPage.phoneCheckBox.click();
        js.executeScript("window.scrollBy(0,300)");
        scheduleARepairPage.addressSecondPage.sendKeys(faker.address().fullAddress());
        scheduleARepairPage.availabilityMorning.click();
        //scheduleARepairPage.submitButton.submit();

    }
    @Then("user will see page {int} of Service Schedule")
    public void userWillSeePageOfServiceSchedule(int arg0) {
        Assert.assertTrue(scheduleARepairPage.submitButton.isDisplayed());
    }

}
