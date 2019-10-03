package edu.seleniumfirefoxgmail.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static edu.seleniumfirefoxgmail.util.constants.LocatorsConstants.FIRST_INNER_ELEMENT_XPATH;
import static edu.seleniumfirefoxgmail.util.constants.LocatorsConstants.SECOND_INNER_ELEMENT_XPATH;

public class IndicatorOfSuccessfulSending {

    private WebElement element;

    public IndicatorOfSuccessfulSending(WebElement element) {
        this.element = element;
    }

    public boolean elementIsIndicatorOfSuccessfulSending() {
        boolean result = false;
        if (element.findElement(By.xpath(FIRST_INNER_ELEMENT_XPATH)) != null &&
                element.findElement(By.xpath(SECOND_INNER_ELEMENT_XPATH)) != null) {
            result = true;
        }
        return result;
    }
}
