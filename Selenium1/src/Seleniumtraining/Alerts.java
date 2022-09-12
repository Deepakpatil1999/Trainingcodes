package Seleniumtraining;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\deepak.patil\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		// Start Edge Session
		WebDriver driver = new EdgeDriver();

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\deepak.patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 * 
		 * // Start Edge Session WebDriver driver = new ChromeDriver();
		 */
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

		driver.findElement(By.xpath("//button[@name=\"alertbox\"]")).click();
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//button[@name=\"confirmalertbox\"]")).click();
		driver.switchTo().alert().dismiss();

		// Alert al= driver.switchTo().alert();

		driver.findElement(By.xpath("//button[@name=\"promptalertbox1234\"]")).click();
		Alert alert = driver.switchTo().alert();
//		 Thread.sleep(10000);
		alert.sendKeys("deepak");
//		 Thread.sleep(10000);
		alert.accept();


	}

}
