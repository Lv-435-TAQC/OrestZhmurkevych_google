package edu.seleniumfirefoxgmail.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPO extends CommonPage {

    @FindBy(css = "input[type = 'email']")
    private WebElement userLoginField;

    @FindBy(css = "div[id = 'identifierNext']")
    private WebElement submitLoginButton;

    @FindBy(xpath = "//input[@type = 'password']")
    private WebElement userPasswordField;

    @FindBy(xpath = "//div[@id = 'passwordNext']")
    private WebElement submitPasswordButton;

    public void setUserLogin(final String login) {
        userLoginField.sendKeys(login);
    }

    public void submitUserLogin() {
        submitLoginButton.click();
    }

    public void setUserPassword(final String password) {
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(userPasswordField));
        userPasswordField.sendKeys(password);
    }

    public void submitUserPassword() {
        submitPasswordButton.click();
    }
}
