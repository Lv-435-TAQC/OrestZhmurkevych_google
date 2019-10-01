package edu.seleniumfirefoxgmail;

import edu.seleniumfirefoxgmail.businessobject.GmailLoginBO;
import edu.seleniumfirefoxgmail.businessobject.SendLetterBO;
import edu.seleniumfirefoxgmail.businessobject.SentMailBO;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static edu.seleniumfirefoxgmail.util.DriverUtil.getDriver;

public class GmailTest {

    private GmailLoginBO gmailLoginBO = new GmailLoginBO();

    //TODO add explicit wait for the letter to sent
    @Test
    public void sendLetterWithDateInSubjectTest() {
        SendLetterBO sendLetterBO = new SendLetterBO();
        gmailLoginBO.loginToGmail();
        sendLetterBO.composeLetterWithDateInSubjectAndSend();
    }

    //TODO add wait for the letters to display
    @Test
    public void showLettersSentToday() {
        SentMailBO sentMailBO = new SentMailBO();
        gmailLoginBO.loginToGmail();
        sentMailBO.showMailWithCurrentDateInSubject();
    }

    @AfterMethod
    public void closeDriver() {
        WebDriver driver = getDriver();
        driver.quit();
    }
}
