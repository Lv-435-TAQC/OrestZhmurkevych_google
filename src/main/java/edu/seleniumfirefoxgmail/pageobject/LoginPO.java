package edu.seleniumfirefoxgmail.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static edu.seleniumfirefoxgmail.util.constants.LocatorsConstants.*;

public class LoginPO extends CommonPage {

    @FindBy(css = USER_LOGIN_FIELD_CSS_LOCATOR)
    private WebElement userLoginField;

    @FindBy(css = SUBMIT_LOGIN_BUTTON_CSS_LOCATOR)
    private WebElement submitLoginButton;

    @FindBy(xpath = USER_PASSWORD_FIELD_XPATH)
    private WebElement userPasswordField;

    @FindBy(xpath = SUBMIT_PASSWORD_BUTTON_XPATH)
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
