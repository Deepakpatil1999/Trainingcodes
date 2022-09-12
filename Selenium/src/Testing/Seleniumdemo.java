package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Seleniumdemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\deepak.patil\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		 
		// Start Edge Session
		WebDriver driver = new EdgeDriver();
		 
		driver.get("https://intranet.attra.com/");
		driver.manage().window().maximize();
		//driver.quit();
		driver.findElement(By.xpath("//img[@src=\"images/HRIS_icon.png\"]")).click();
	}

}
