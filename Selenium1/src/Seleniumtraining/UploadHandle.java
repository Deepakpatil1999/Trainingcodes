package Seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadHandle {
	public static void main(String[] args) {
		
	
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\deepak.patil\\Downloads\\chromedriver_win32\\chromedriver.exe");

	// Start Edge Session
	WebDriver driver = new ChromeDriver();

	driver.get("https://html.com/input-type-file/");
	driver.manage().window().maximize();
	driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\deepak.patil\\Pictures\\Screenshots");
	System.out.println(driver.getCurrentUrl());

	System.out.println(driver.getTitle());
//	System.out.println(driver.getPageSource());
	driver.navigate().to("https://www.google.co.in/");

}
}
