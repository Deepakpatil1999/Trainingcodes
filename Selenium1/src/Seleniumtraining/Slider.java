package Seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\deepak.patil\\Downloads\\chromedriver_win32\\chromedriver.exe");

		// Start Edge Session
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/slider");
		driver.manage().window().maximize();
	WebElement slider = driver.findElement(By.xpath("//input[@class=\"range-slider range-slider--primary\"]"));
    Actions move = new Actions(driver);
    Action action = (Action) move.dragAndDropBy(slider, 30, 0).build();
    ((Actions) action).perform();
	

}
}
