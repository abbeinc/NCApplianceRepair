package com.ncApplianceRepair.pages;

import com.ncApplianceRepair.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScheduleARepairPage {

    public ScheduleARepairPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static void goToScheduleService() {
        Driver.getDriver().get("https://ncappliancerepair.com/schedule-service/");
    }

    @FindBy(xpath = "//div[@class='el-input']/input[@id='cog-0']")
    public WebElement zipCode;

    @FindBy(xpath = "//div[.='Unfortunately, we do not service that zip code']/../../..")
    public WebElement zipCodeWarning;

    @FindBy(xpath = "//div[.='ZIP CODE (Where Appliance is Located) is required.']")
    public WebElement zipCodeWarning2;

    @FindBy(xpath = "//span[contains(.,'Regfrigerator')][@class='el-checkbox__label']")
    public WebElement refrigeratorCheckBox;

    @FindBy(xpath = "//button//span[@class='cog-button__text']")
    public WebElement buttonNext;

    @FindBy(xpath = "//span[@class='el-checkbox__label'][contains(.,'Top Freeer')]")
    public WebElement topFreezer;

    @FindBy(xpath = "//div[@class='el-checkbox-group']//span[@class='el-checkbox__label'][contains(.,'Whirlpool')]")
    public WebElement whirlpoolBrand;

    @FindBy(xpath = "//span[@class='el-checkbox__label'][contains(.,'Not Cooling')]")
    public WebElement notCooling;

    @FindBy(xpath = "//label[contains(.,'Name')]/../div/div/input")
    public WebElement nameSecondPage;


    @FindBy(xpath = "//label[contains(.,'Phone')]/../div/div/input ")
    public WebElement phoneSecondPage;
    @FindBy(xpath = "//label[contains(.,'Email')]/../div/div/input ")
    public WebElement emailSecondPage;

    @FindBy(xpath = "//span[@class='el-checkbox__label'][contains(.,'Phone')]")
    public WebElement phoneCheckBox;

    @FindBy(xpath = "//div[@class='cog-choice']//label[contains(.,'Text')]/span/span")
    public WebElement textCheckBox;

    @FindBy(xpath = "//label[contains(.,'Address')]//following-sibling::div/div/input")
    public WebElement addressSecondPage;

    @FindBy(xpath = "//legend[contains(.,'Availability')]/../div//span[@class=\"el-checkbox__input\"]/following-sibling::span[contains(.,'Morning (8am-11am)')]")
    public WebElement availabilityMorning;

    @FindBy(xpath = "//legend[contains(.,'Availability')]/../div//span[@class=\"el-checkbox__input\"]/following-sibling::span[contains(.,'Afternoon (11am-2pm)')]")
    public WebElement availabilityAfternoon;

    @FindBy(xpath = "//legend[contains(.,'Availability')]/../div//span[@class=\"el-checkbox__input\"]/following-sibling::span[contains(.,'Late Afternoon (2pm-5pm)')]")
    public WebElement availabilityLateAfternoon;

    @FindBy(xpath = "//span[@class='cog-button__text'][contains(.,'Submit')]")
    public WebElement submitButton;

    @FindBy(xpath = "//span[@class='el-checkbox__label'][contains(.,'Washer')]")
    public WebElement washer;

    @FindBy(xpath = "//span[@class='el-checkbox__label'][contains(.,'Oven')]")
    public WebElement oven;

    @FindBy(xpath = "//span[@class='el-checkbox__label'][contains(.,'Freezer')]")
    public WebElement freezer;

    @FindBy(xpath = "//span[@class='el-checkbox__label'][contains(.,'Range')]")
    public WebElement range;

    @FindBy(xpath = "//span[@class='el-checkbox__label'][contains(.,'Front Load')]")
    public WebElement frontLoad;

    @FindBy(xpath = "//div[@class='cog-row']//span[@class='el-checkbox__label'][contains(.,'GE')]")
    public WebElement gEBrand;

    @FindBy(xpath = "//legend[contains(.,'Issue with Washer')]/following-sibling::div/div/div/label/span[contains(.,'Not Draining')]")
    public WebElement notDraining;

    @FindBy(xpath = "//legend[contains(.,'Type of Appliance')]/..//label/span[contains(.,'Dryer')]")
    public WebElement dryer;

    @FindBy(xpath = "//legend[contains(.,'Type of Appliance')]/..//label/span[contains(.,'Cooktop')]")
    public WebElement cooktop;

    @FindBy(xpath = "//label[contains(.,'Gas')]")
    public WebElement dryerTypeGas;

    @FindBy(xpath = "//div[@class=\"el-checkbox-group\"]//label[contains(.,'Microwave Combo')]/span[contains(.,'Oven')]")
    public WebElement ovenTypeMicrowaveCombo;

    @FindBy(xpath = "//div[@class=\"el-checkbox-group\"]//label[contains(.,'Electric')]/span/span")
    public WebElement cooktopTypeElectric;

    @FindBy(xpath = "//div[@class=\"el-checkbox-group\"]//label[contains(.,'Upright Freezer')]/span[contains(.,'Freezer')]")
    public WebElement freezerTypeUprightFreezer;

    @FindBy(xpath = "//div[@class='el-checkbox-group']//span[@class='el-checkbox__label'][contains(.,'Kenmore')]")
    public WebElement kenmoreBrand;

    @FindBy(xpath = "//div[@class='el-checkbox-group']//span[@class='el-checkbox__label'][contains(.,'JennAir')]")
    public WebElement jennAirBrand;

    @FindBy(xpath = "//div[@class='el-checkbox-group']//span[@class='el-checkbox__label'][contains(.,'SubZero')]")
    public WebElement subZero;
    @FindBy(xpath = "//div[@class='el-checkbox-group']//span[@class='el-checkbox__label'][contains(.,'Hotpoint')]")
    public WebElement hotpointBrand;
    @FindBy(xpath = "//div[@class='el-checkbox-group']//span[@class='el-checkbox__label'][contains(.,'Amana')]")
    public WebElement amanaBrand;

    @FindBy(xpath = "//legend[contains(.,'Issue with Dryer')]/..//label/span[contains(.,'Noisy')]")
    public WebElement dryerNoisyIssue;

    @FindBy(xpath = "//legend[contains(.,'Issue With Cooktop')]/..//label/span[contains(.,'Constant Clicking Noise')]")
    public WebElement cooktopConstantClickingNoiseIssue;
    @FindBy(xpath = "//legend[contains(.,'Issue With Range')]/..//label/span[contains(.,'Bake not heating')]")
    public WebElement rangeBakeNotHeatingIssue;
    @FindBy(xpath = "//legend[contains(.,'Issue With Oven')]/..//label/span[contains(.,'Door Locked')]")
    public WebElement ovenDoorLockedIssue;

    @FindBy(xpath = "//legend[contains(.,'Type of Appliance')]/..//label/span[contains(.,'Dishwasher')]")
    public WebElement dishwasher;

    @FindBy(xpath = "//div[@class='el-checkbox-group']//span[@class='el-checkbox__label'][contains(.,'KitchenAid')]")
    public WebElement kitchenAidBrand;

    @FindBy(xpath = "//legend[contains(.,'Issue with Dishwasher')]/..//label/span[contains(.,'Leaking')]")
    public WebElement dishwasherLeakingIssue;

    @FindBy(xpath = "//legend[contains(.,'Range')]/..//label/span[contains(.,'Dual Fuel')]")
    public WebElement rangeTypeDualFuel;



}
