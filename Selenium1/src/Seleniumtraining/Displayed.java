package Seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Displayed {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\deepak.patil\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		 
		// Start Edge Session
		WebDriver driver = new EdgeDriver();
		 
		driver.get("https://www.guru99.com/xpath-selenium.html");
		driver.manage().window().maximize();
		boolean element= driver.findElement(By.xpath("//*[@id=\"post-987\"]/div/div/ul[1]/li[11]/a")).isDisplayed();
		System.out.println("It is Displayed "+element);
	}

}
