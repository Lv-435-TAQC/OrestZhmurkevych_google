package edu.seleniumfirefoxgmail.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static edu.seleniumfirefoxgmail.util.constants.LocatorsConstants.*;

public class SentPO extends CommonPage {

    @FindBy(xpath = SENT_MAIL_SECTION_XPATH)
    private WebElement sentMailSection;

    @FindBy(xpath = SENT_MAIL_FILTER_BUTTON_XPATH)
    private WebElement sentMailFilterButton;

    @FindBy(xpath = SENT_MAIL_FILTER_SUBJECT_FIELD_XPATH)
    private WebElement sentMailFilterSubjectField;

    @FindBy(xpath = SUBMIT_FILTER_BUTTON_XPATH)
    private WebElement submitFilterButton;

    public void showSentMail() {
        sentMailSection.click();
    }

    public void openSentMailFilter() {
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.attributeToBe(
                (By.xpath("//div[@class = 'TN bzz aHS-bnu']/../..")), "class", "aim ain"));
        sentMailFilterButton.click();
    }

    public void setSubjectToSentMailFilter(final String subject) {
        sentMailFilterSubjectField.sendKeys(subject);
    }

    public void submitFilter() {
        submitFilterButton.click();
    }
}
