package edu.seleniumfirefoxgmail.businessobject;

import edu.seleniumfirefoxgmail.pageobject.LoginPO;
import org.openqa.selenium.WebDriver;

import static edu.seleniumfirefoxgmail.util.DriverUtil.getDriver;

public class GmailLoginBO {

    public void loginToGmail() {
        WebDriver driver = getDriver();
        LoginPO loginPO = new LoginPO();
        driver.get("https://www.gmail.com");
        loginPO.setUserLogin("orest.zhmurkevych.secondary@gmail.com");
        loginPO.submitUserLogin();
        loginPO.setUserPassword("passwordfortest");
        loginPO.submitUserPassword();
    }
}
