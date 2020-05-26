package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailStatusPage extends BasePage {

	@FindBy(xpath="//*[@class='block_confirmation']")
	private WebElement lbConfirmBlock;

	@FindBy(name="arr[]")
	private WebElement addCheckBox;

	@FindBy(xpath="//input[@type='submit']")
	private WebElement btnAddToAddressBook;


	@FindBy(xpath="//div[1]/div[5]/ul/li[2]/a")
	private WebElement btnCheckMails;



	public String getLbConfirmBlock() {
        return lbConfirmBlock.getText();
    }

    public void clickAddCheckBox() {
	    addCheckBox.click();
    }

    public void clickAddToAddressBook() {
	    btnAddToAddressBook.click();
    }

    public void clickCheckMails() {
        btnCheckMails.click();
    }


}
