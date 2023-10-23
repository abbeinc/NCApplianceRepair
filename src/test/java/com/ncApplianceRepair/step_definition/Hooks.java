package com.ncApplianceRepair.step_definition;

import com.ncApplianceRepair.utility.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before("@single")
    public void setupDriver() {
        System.out.println("THIS IS FROM @Before inside hooks class");
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        Driver.getDriver().manage().window().maximize();
    }

    @After("@single")
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Attached img");


        }


        System.out.println("THIS IS FROM @After inside hooks class");
        Driver.closeBrowser();

    }


}
