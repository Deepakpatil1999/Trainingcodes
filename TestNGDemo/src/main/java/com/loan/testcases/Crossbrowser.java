package com.loan.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Crossbrowser {
	
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void verifyPageTitle(String browsername ) throws InterruptedException
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\deepak.patil\\Downloads\\chromedriver_win32\\chromedriver.exe");

			driver= new  ChromeDriver();
			
			
		}
		else if(browsername.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver",
					 "C:\\Users\\deepak.patil\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver= new  EdgeDriver();
		}
	
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	Thread.sleep(2000);
}
}