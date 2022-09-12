package com.swaglabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabAddtoCartPage {

	WebDriver driver;

	public SwagLabAddtoCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "checkout")
	WebElement clickcheckout;

	public SwagLabInformationPage clickOnCheckout() {
		clickcheckout.click();
		return new SwagLabInformationPage(driver);
	}

}
