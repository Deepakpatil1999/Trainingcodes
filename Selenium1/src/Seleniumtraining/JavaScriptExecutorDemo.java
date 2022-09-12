package Seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptExecutorDemo {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.edge.driver", "C:\\Users\\deepak.patil\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	 
	// Start Edge Session
	WebDriver driver = new EdgeDriver();
	 
	driver.get("https://intranet.attra.com/intranet/");
	driver.manage().window().maximize();
	
	//JavaScriptExecutor js=driver;
	WebElement element=driver.findElement(By.id("c"));
	JavascriptExecutor js =(JavascriptExecutor) driver;
	js.executeScript("element");
}
}
