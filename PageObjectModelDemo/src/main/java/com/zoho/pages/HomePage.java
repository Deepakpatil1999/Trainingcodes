package com.zoho.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	WebDriver driver;

	public static Logger log = LogManager.getLogger(HomePage.class.getName());


	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='Sign in']")
	WebElement Signin;

	public void gotCustomers() {

	}

	public void gotSupport() {

	}

	public void gotContactSales() {

	}

	public LoginPage gotSignin() {
		Signin.click();
		return new LoginPage(driver);

	}

	public void gotFreesignup() {

	}

//	WebElement element = driver.findElement(By.xpath("//a[text()=\"Sign in\"]")).click();
}
