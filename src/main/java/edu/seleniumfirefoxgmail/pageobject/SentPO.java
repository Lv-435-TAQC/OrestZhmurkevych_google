package edu.seleniumfirefoxgmail.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SentPO extends CommonPage {

    @FindBy(xpath = "//div[@class = 'TN bzz aHS-bnu']")
    private WebElement sentMailSection;

    @FindBy(xpath = "//button[@class = 'gb_vf' and @gh = 'sda']")
    private WebElement sentMailFilterButton;

    @FindBy(xpath = "//input[@class = 'ZH nr aQd']")
    private WebElement sentMailFilterSubjectField;

    @FindBy(xpath = "//div[@class = 'T-I J-J5-Ji Zx aQe T-I-atl L3' and @role = 'button']")
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
