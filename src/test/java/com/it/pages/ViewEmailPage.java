package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewEmailPage extends BasePage {


    @FindBy(xpath = "//div[@class='message_header clear']//h3")
    private WebElement letterSubject;
    @FindBy(xpath = "//*[@class='to']//div[@class='field_value']")
    private WebElement letterReceiverAddress;
    @FindBy(xpath = "//div[@class='message_body']")
    private WebElement letterDescription;

    public String getLetterSubject() {
        return letterSubject.getText();
    }

    public String getLetterReceiverAddress() {
        return letterReceiverAddress.getText();
    }

    public String getLetterDescription() {
        return letterDescription.getText();
    }
}
