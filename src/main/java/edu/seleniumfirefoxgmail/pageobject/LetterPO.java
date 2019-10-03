package edu.seleniumfirefoxgmail.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static edu.seleniumfirefoxgmail.util.constants.LocatorsConstants.*;


public class LetterPO extends CommonPage {

    @FindBy(xpath = COMPOSE_BUTTON_XPATH)
    private WebElement composeButton;

    @FindBy(name = ADDRESS_FIELD_LOCATOR)
    private WebElement addressField;

    @FindBy(name = SUBJECT_FIELD_LOCATOR)
    private WebElement subjectField;

    @FindBy(xpath = SEND_BUTTON_XPATH)
    private WebElement sendButton;

    @FindBy(xpath = SUCCESSFUL_SENDING_INDICATOR_XPATH)
    private WebElement indicatorOfSuccessfulSending;

    public void openComposeLetterForm() {
        composeButton.click();
    }

    public void setAddress(final String address) {
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(addressField));
        addressField.sendKeys(address);
    }

    public void setSubject(final String subject) {
        subjectField.sendKeys(subject);
    }

    public void sendLetter() {
        sendButton.click();
//        if (indicatorOfSuccessfulSending.elementIsIndicatorOfSuccessfulSending()) {
            (new WebDriverWait(driver, 30)).until(ExpectedConditions.invisibilityOf(indicatorOfSuccessfulSending));
//        }
    }
}
