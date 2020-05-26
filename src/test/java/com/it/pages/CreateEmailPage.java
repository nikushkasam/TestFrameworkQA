package com.it.pages;

import com.it.Emails.Email;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateEmailPage extends BasePage {

    @FindBy(id = "to")
    private WebElement inputRecipient;

    @FindBy(xpath = "//input[@tabindex='5']")
    private WebElement inputSubject;

    @FindBy(id = "text")
    private WebElement inputDescription;

    @FindBy(name = "send")
    private WebElement btnSend;

    @FindBy(name = "save_in_drafts")
    private WebElement btnSaveInDrafts;



    public void createEmail(Email email) {
        inputRecipient.sendKeys(email.letterEmail);
        inputSubject.sendKeys(email.letterSubject);
        inputDescription.sendKeys(email.letterDescription);
        btnClickSend();
    }

    public void setInputRecipient(String email) {
        inputRecipient.sendKeys(email);
    }

    public void setInputSubject(String subject) {
        inputSubject.sendKeys(subject);
    }

    public void setInputDescription(String description) {
        inputDescription.sendKeys(description);
    }

    public void btnClickSend() {
        btnSend.click();
    }

    public void btnClickSaveInDrafts() {
        btnSaveInDrafts.click();
    }


}
