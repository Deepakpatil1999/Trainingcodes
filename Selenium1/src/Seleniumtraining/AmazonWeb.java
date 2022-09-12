package Seleniumtraining;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonWeb {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\deepak.patil\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		// Start Edge Session
		WebDriver driver = new EdgeDriver();

		
		driver.get("https://www.amazon.in/s?k=amazon+com&hvadid=73048880413275&hvbmt=be&hvdev=c&hvqmt=e&tag=msndeskstdin-21&ref=pd_sl_4cc5demh34_e");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Water purifier");
		
		driver.findElement(By.id("nav-search-submit-text")).click();
		
		driver.findElement(By.xpath("//*[@id=\"p_90/6741117031\"]/span/a/div/label/i")).click();
		driver.findElement(By.xpath("//img[@src=\"https://m.media-amazon.com/images/I/51XK4ldf9sL._AC_UY218_.jpg\"]")).click();
		driver.findElement(By.id("a-autoid-0-announce")).click();
		//JavascriptExecutor
		/*
		 * JavascriptExecutor js=(JavascriptExecutor)driver; js.executeScript(window.s,
		 * args) js.executeScript(window.s, args)
		 */
	}
	

}
