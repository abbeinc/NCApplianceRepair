package com.ncApplianceRepair.pages;

import com.ncApplianceRepair.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {


    public MainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    public static void goToMainPage(){
        Driver.getDriver().get("https://ncappliancerepair.com/");
    }
    @FindBy(xpath = "//li[@id='menu-item-357']/a[.='Home']")
    public WebElement homeButton;

    @FindBy(xpath = "//a[@id='brxe-4a5535']")
    public WebElement scheduleARepair;

    @FindBy(xpath = "//li[@id='menu-item-358']/div[@class='brx-submenu-toggle icon-right']/a[.='We Repair']")
    public WebElement weRepair;

    @FindBy(xpath = "//li[@id='menu-item-503']/a")
    public WebElement refrigeratorRepair;

    @FindBy(xpath = "//li[@id='menu-item-541']/a")
    public WebElement washerRepair;

    @FindBy(xpath = "//li[@id='menu-item-561']/a")
    public WebElement dishwasherRepair;

    @FindBy(xpath = "//li[@id='menu-item-584']/a")
    public WebElement dryerRepair;

    @FindBy(xpath = "//li[@id='menu-item-604']/a")
    public WebElement ovenAndRangeRepair;
    @FindBy(xpath = "//li[@id='menu-item-353']/div/a")
    public WebElement serviceArea;

    @FindBy(xpath = "//li[@id='menu-item-356']/a")
    public WebElement charlotteArea;

    @FindBy(xpath = "//li[@id='menu-item-355']/a")
    public WebElement matthewsArea;

    @FindBy(xpath = "//li[@id='menu-item-367']/a")
    public WebElement waxhawArea;

    @FindBy(xpath = "//li[@id='menu-item-420']/a")
    public WebElement indianTrailArea;
    @FindBy(xpath = "//li[@id='menu-item-354']/a")
    public WebElement monroeArea;


    @FindBy(xpath = "//div[@id='brxe-70805c']")
    public WebElement refrigeratorRepairPic;

    @FindBy(xpath = "//h3[@id='brxe-7f841c']/a[.='Refrigerator Repair']")
    public WebElement refrigeratorRepairPicHovered;

    @FindBy(xpath = "//div[@id='brxe-xeqhlh']")
    public WebElement washerRepairPic;
    @FindBy(xpath = "//h3[@id='brxe-wztbfr']/a[.='Washer Repair']")
    public WebElement washerRepairPicHovered;

    @FindBy(xpath = "//div[@id='brxe-95fb17']")
    public WebElement rangeAndOvenRepairPic;

    @FindBy(xpath = "//h3[@id='brxe-0bbb46']/a[.='Range & Oven Repair']")
    public WebElement rangeAndOvenRepairPicHovered;



    @FindBy(xpath = "//div[@id='brxe-f1558e']")
    public WebElement dryerRepairPic;
    @FindBy(xpath = "//h3[@id='brxe-b8c763']/a[.='Dryer Repair']")
    public WebElement dryerRepairPicHovered;


    @FindBy(xpath = "//div[@id='brxe-qkbahm']")
    public WebElement dishwasherRepairPic;

    @FindBy(xpath = "//h3[@id='brxe-ehuavs']/a")
    public WebElement dishwasherRepairPicHovered;


    @FindBy(xpath = "//div[@id='brxe-xbjzkq']")
    public WebElement microwaveRepairPic;

    @FindBy(xpath = "//h3[@id='brxe-evdvss']/a")
    public WebElement microwaveRepairPicHovered;

    @FindBy(xpath = "//div[@id='brxe-336736']/a[@id='brxe-d75ba4']")
    public WebElement scheduleARepair2;


    @FindBy(xpath = "//li[@id='brxe-cc31f8']/a")
    public WebElement locationLinkCharlotte;


    @FindBy(xpath = "//li[@id='brxe-91aeaa']/a")
    public WebElement locationLinkMatthews;

    @FindBy(xpath = "//li[@id='brxe-75f6d6']/a")
    public WebElement locationLinkMonroe;

    @FindBy(xpath = "//li[@id='brxe-99ed50']/a")
    public WebElement locationLinkWaxhaw;

    @FindBy(xpath = "//li[@id='brxe-uisrpl']/a")
    public WebElement locationLinkIndianTrail;


}
