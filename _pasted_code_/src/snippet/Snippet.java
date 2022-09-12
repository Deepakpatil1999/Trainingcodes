package snippet;

public class Snippet {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\deepak.patil\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			 
			// Start Edge Session
			WebDriver driver = new EdgeDriver();
			 
			driver.get("https://intranet.attra.com/intranet/");
			driver.manage().window().maximize();
}

