package com.swaglabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabOverviewPage {

	WebDriver driver;

	public SwagLabOverviewPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "finish")
	WebElement clickfinish;

	public void clickOnfinish() {
		clickfinish.click();
	}

}
