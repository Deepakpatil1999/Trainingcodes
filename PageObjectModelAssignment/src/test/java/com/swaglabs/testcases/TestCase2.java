package com.swaglabs.testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.swaglabs.pages.SwagLabAddtoCartPage;
import com.swaglabs.pages.SwagLabInformationPage;
import com.swaglabs.pages.SwagLabInventoryPage;
import com.swaglabs.pages.SwagLabLoginPage;
import com.swaglabs.pages.SwagLabOverviewPage;

public class TestCase2 {
	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\deepak.patil\\Downloads\\chromedriver_win32\\chromedriver.exe");

		// Start Edge Session
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

		SwagLabLoginPage loginpage = new SwagLabLoginPage(driver);
		//ExcelDataFinal excel = new ExcelDataFinal();
		Excel excel = new Excel();

		SwagLabInventoryPage inventorypage=loginpage.Credentials(excel.getData().get(1), excel.getData().get(2));
		SwagLabAddtoCartPage addtocartpage =inventorypage.clickOnAddtocart();
		
		SwagLabInformationPage infopage=addtocartpage.clickOnCheckout();
		Excel1 excel1 = new Excel1();
		//ExcelDataFinal excel1 = new ExcelDataFinal();
		
		SwagLabOverviewPage overviewpage = infopage.informationPage(excel1.getData().get(1), excel1.getData().get(2), excel1.getData().get(3));
		overviewpage.clickOnfinish();

	}
}
