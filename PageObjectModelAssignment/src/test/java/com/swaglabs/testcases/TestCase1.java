package com.swaglabs.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCase1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\deepak.patil\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		// Start Edge Session
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		Thread.sleep(2000);

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
		driver.findElement(By.id("checkout")).click();

		driver.findElement(By.id("first-name")).sendKeys("Deepak");
		driver.findElement(By.id("last-name")).sendKeys("Patil");
		driver.findElement(By.id("postal-code")).sendKeys("585312");
		driver.findElement(By.id("continue")).click();

		driver.findElement(By.id("finish")).click();

	}

}
