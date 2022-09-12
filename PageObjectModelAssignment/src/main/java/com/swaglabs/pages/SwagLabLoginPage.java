package com.swaglabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage {

	WebDriver driver;

	public SwagLabLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "user-name")
	WebElement clickusername;

	@FindBy(id = "password")
	WebElement clickpassword;

	@FindBy(id = "login-button")
	WebElement clicklogin;

	public SwagLabInventoryPage Credentials(String username, String password) {
		clickusername.sendKeys(username);
		clickpassword.sendKeys(password);
		clicklogin.click();
		return new SwagLabInventoryPage(driver);
	}

}
