package Seleniumtraining;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resizable {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\deepak.patil\\Downloads\\chromedriver_win32\\chromedriver.exe");

		// Start Edge Session
		WebDriver driver = new ChromeDriver();
	 driver.navigate().to("https://www.softwaretestingmaterial.com");
     System.out.println(driver.manage().window().getSize());
     //Create object of Dimensions class
     Dimension d = new Dimension(480,620);
     //Resize the current window to the given dimension
     driver.manage().window().setSize(d);
     System.out.println(driver.manage().window().getSize());
  }
}


