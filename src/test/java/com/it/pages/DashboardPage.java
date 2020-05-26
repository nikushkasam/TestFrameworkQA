package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {

    @FindBy(xpath = "//span[@class='sn_menu_title']")
    private WebElement lbUserEmail;

    @FindBy(xpath = "//*[@class='make_message']/a")
    private WebElement btnCreateEmail;

    @FindBy(xpath = "//*[@class='sbj']")
    private WebElement sbjText;

	@FindBy(xpath="//span[@class]//input[@type='text']")
	private WebElement inputSearchEmail;

	@FindBy(xpath="//span[@class='button l_r do_search']")
	private WebElement btsSearchEmail;

    @FindBy(xpath="//*[@id='mesgList']//div[@class='row new'][1]")
    private WebElement rowFirstNewLetter;




    public String getSbjText() {
        return sbjText.getText();
    }

    public String getLbUserEmail() {
        return lbUserEmail.getText();
    }

    public void btnClickCreateEmail() {
        btnCreateEmail.click();
    }

    public void btnСlickRowFirstNewLetter() {
        rowFirstNewLetter.click();
    }

}
