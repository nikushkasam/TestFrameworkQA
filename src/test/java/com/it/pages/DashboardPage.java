package com.it.pages;

import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

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
        WebDriverWait webDriverWait = new WebDriverWait(driver, 20);
        /*WebElement lbUserEmail = webDriverWait.until(driver -> driver.findElement(By.xpath("//span[@class='sn_menu_title']")));*/
        return webDriverWait.until(ExpectedConditions.visibilityOf(lbUserEmail)).getText();
    }

    public void btnClickCreateEmail() {
        btnCreateEmail.click();
    }

    public void btnСlickRowFirstNewLetter() {
        rowFirstNewLetter.click();
    }

}
