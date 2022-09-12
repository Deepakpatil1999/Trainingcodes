package Seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Seleniumtopicweb {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\deepak.patil\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		 
		// Start Edge Session
		WebDriver driver = new EdgeDriver();
		 
		driver.get("https://www.guru99.com/xpath-selenium.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Basic XPath']")).click();
		WebElement element = driver.findElement(By.xpath("//*[text()='http://demo.guru99.com/test/selenium-xpath.html']"));
		//element.getText();
		System.out.println(element.getText());
	}

}
