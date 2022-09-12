package Seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import net.bytebuddy.asm.Advice.Argument;

public class Seleniumdemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\deepak.patil\\Downloads\\chromedriver_win32\\chromedriver.exe");

		// Start Edge Session
		WebDriver driver = new ChromeDriver();
		driver.get("https://intranet.attra.com/intranet/");
		driver.manage().window().maximize();
		//driver.findElement(By.name("txtuser")).sendKeys("deepak.patil@attra.com.au");
		
		//driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Welcome@1008");
		driver.findElement(By.xpath("//span[@class=\"checkmark\"]")).click();
		
		//WebElement element=driver.findElement(By.xpath("//div[@class=\"recaptcha-checkbox-border\"]"));
		//JavascriptExecutor js = (JavascriptExecutor) driver;
	//	js.executeScript("argument[0].click()", element);
	//	js.executeScript(element, "click");
		//driver.findElement(By.xpath("//div[@class=\"recaptcha-checkbox-border\"]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element1=(WebElement) js.executeScript("return document.getElementById('txtuser');");
        element1.sendKeys("deepak");
        
        WebElement element2=(WebElement) js.executeScript("return document.getElementById('txtpassword');");
        element2.sendKeys("patil");
        
		/*
		 * WebElement element3=(WebElement) js.
		 * executeScript("return document.getElementsByClassName('recaptcha-checkbox-borderAnimation');"
		 * ); element3.click();
		 */
        //document.getElementsByClassName('recaptcha-checkbox-borderAnimation')
		driver.findElement(By.id("google-authentic")).click();
		 
		//driver.quit();
	}

}
