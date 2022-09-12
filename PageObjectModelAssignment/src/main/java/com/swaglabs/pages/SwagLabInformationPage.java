package com.swaglabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabInformationPage {
	WebDriver driver;

	public SwagLabInformationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "first-name")
	WebElement enterfirstname;

	@FindBy(id = "last-name")
	WebElement enterlastname;

	@FindBy(id = "postal-code")
	WebElement enterzipcode;

	@FindBy(id = "continue")
	WebElement clickcontinue;

	public SwagLabOverviewPage informationPage(String firstname, String lastname, String postalcode) {
		enterfirstname.sendKeys(firstname);
		enterlastname.sendKeys(lastname);
		enterzipcode.sendKeys(postalcode);
		clickcontinue.click();
		return new SwagLabOverviewPage(driver);

	}

}
