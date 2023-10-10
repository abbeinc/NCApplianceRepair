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



}
