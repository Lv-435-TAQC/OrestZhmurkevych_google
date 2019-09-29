package edu.seleniumfirefoxgmail.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LetterPO extends CommonPage {

    @FindBy(xpath = "//div[@role = 'button' and @jslog= '20510; u014N:cOuCgd,Kr2w4b']")
    private WebElement composeButton;

    @FindBy(name = "to")
    private WebElement addressField;

    @FindBy(name = "subjectbox")
    private WebElement subjectField;

    @FindBy(xpath = "//div[@class = 'T-I J-J5-Ji aoO v7 T-I-atl L3' and @role = 'button']")
    private WebElement sendButton;

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
    }
}
