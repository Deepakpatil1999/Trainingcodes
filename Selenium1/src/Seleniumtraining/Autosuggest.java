package Seleniumtraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Autosuggest {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\deepak.patil\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		// Start Edge Session
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.google.co.in/webhp");
		driver.manage().window().maximize();
		String s1="tv9 kannada";
		//WebElement element=
		driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("tv9");

		//List<WebElement>  dynamicelement= driver.findElements(By.xpath("//span[text()=\"tv9\"]"));
		List<WebElement>  dynamicelement= driver.findElements(By.tagName("li"));
		for (WebElement a : dynamicelement)
		{
			String s2=a.getText();
			if(s2.equalsIgnoreCase(s1));
			
				a.click();
				break;
			}
		

}
}
