package edu.seleniumfirefoxgmail.businessobject;

import edu.seleniumfirefoxgmail.pageobject.LoginPO;
import org.openqa.selenium.WebDriver;

import static edu.seleniumfirefoxgmail.util.DriverUtil.getDriver;
import static edu.seleniumfirefoxgmail.util.constants.GmailConstants.*;

public class GmailLoginBO {

    public void loginToGmail() {
        WebDriver driver = getDriver();
        LoginPO loginPO = new LoginPO();
        driver.get(GMAIL_URL);
        loginPO.setUserLogin(LOGIN);
        loginPO.submitUserLogin();
        loginPO.setUserPassword(PASSWORD);
        loginPO.submitUserPassword();
    }
}
