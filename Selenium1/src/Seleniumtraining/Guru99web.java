package Seleniumtraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Guru99web {

	// input[@type='text'and@class="gsc-input"]

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\deepak.patil\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		// Start Edge Session
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
//		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();
		// driver.findElement(By.xpath("//input[@type='text'and@class='gsc-input']")).sendKeys("java");
		// driver.findElement(By.id("vfb-7-1")).click();
//		driver.findElement(By.id("vfb-6-0")).click();

		List<WebElement> element = driver.findElements(By.xpath("//*[@type=\"radio\"]"));
		System.out.println((element.size()));

		for (int i = 0; i < element.size(); i++) {
			element.get(i).click();
//			boolean b=element.get(i).isSelected();
//			
//			if(b==true)
//			{
//				element.get(i).click();
//			}
//		//input[@type="checkbox"]	

		}
		List<WebElement> element1 = driver.findElements(By.xpath("//input[@type=\"checkbox\"]	"));
		System.out.println((element.size()));

		for (int i = 0; i < element1.size(); i++) {
			element1.get(i).click();

		}
	}
}
