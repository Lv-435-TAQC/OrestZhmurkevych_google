package edu.seleniumfirefoxgmail.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static edu.seleniumfirefoxgmail.util.DriverUtil.getDriver;

public class CommonPage {

    protected WebDriver driver;

    public CommonPage() {
        driver = getDriver();
        PageFactory.initElements(driver, this);
    }
}
