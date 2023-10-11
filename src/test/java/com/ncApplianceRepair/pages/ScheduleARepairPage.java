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

    @FindBy(xpath = "//label[contains(.,'Name')]/following-sibling::div/div/input")
    public WebElement nameSecondPage;

@FindBy(xpath = "//label[contains(.,'Phone')]/following-sibling::div/div/input  ")
public WebElement phoneSecondPage;
    @FindBy(xpath = "//label[contains(.,'Email')]/following-sibling::div/div/input  ")
    public WebElement emailSecondPage;

    @FindBy(xpath = "//span[@class='el-checkbox__label'][contains(.,'Phone')]")
    public WebElement phoneCheckBox;

    @FindBy(xpath = "//label[contains(.,'Address')]//following-sibling::div/div/input")
    public WebElement addressSecondPage;

    @FindBy(xpath = "//legend[contains(.,'Availability')]/../div//span[@class=\"el-checkbox__input\"]/following-sibling::span[contains(.,'Morning (8am-11am)')]")
    public WebElement availabilityMorning;

    @FindBy(xpath = "//span[@class='cog-button__text'][contains(.,'Submit')]")
    public WebElement submitButton;

    @FindBy(xpath = "//span[@class='el-checkbox__label'][contains(.,'Washer')]")
    public WebElement washer;
    @FindBy(xpath = "//span[@class='el-checkbox__label'][contains(.,'Front Load')]")
    public WebElement frontLoad;

    @FindBy(xpath = "//div[@class='cog-row']//span[@class='el-checkbox__label'][contains(.,'GE')]")
    public WebElement gEBrand;

    @FindBy(xpath = "//legend[contains(.,'Issue with Washer')]/following-sibling::div/div/div/label/span[contains(.,'Not Draining')]")
    public WebElement notDraining;

}
