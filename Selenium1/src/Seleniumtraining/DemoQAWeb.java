package Seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoQAWeb {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\deepak.patil\\Downloads\\chromedriver_win32\\chromedriver.exe");

		// Start Edge Session
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();

		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement target=driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
		
		act.dragAndDrop(source, target).build().perform();
		//*[@id="droppable"]/p

}
}
