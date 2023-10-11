package com.ncApplianceRepair.pages;

import com.ncApplianceRepair.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScheduleARepairPage {

    public ScheduleARepairPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static void goToScheduleService(){
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

    @FindBy(xpath = "//div[@data-page='2']//label[@id='cog-7-label']")
    public WebElement secondPageName;

    @FindBy(xpath = "//input[@id='cog-7']")
    public WebElement nameSecondPage;

@FindBy(xpath = "//input[@id='cog-8']")
public WebElement phoneSecondPage;
    @FindBy(xpath = "//input[@id='cog-9']")
    public WebElement emailSecondPage;

    @FindBy(xpath = "//span[@class='el-checkbox__label'][contains(.,'Phone')]")
    public WebElement phoneCheckBox;

    @FindBy(xpath = "//input[@id='cog-11']")
    public WebElement addressSecondPage;

    @FindBy(xpath = "//span[@class='el-checkbox__label'][contains(.,'Morning (8am-11am)')]")
    public WebElement availabilityMorning;

    @FindBy(xpath = "//span[@class='cog-button__text'][contains(.,'Submit')]")
    public WebElement submitButton;
}
