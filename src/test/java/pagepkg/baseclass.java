package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class baseclass {

	
	
	
	
	public static WebDriver driver;
	String baseurl = "https://www.saucedemo.com/";
	
	
	@BeforeTest
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.get(baseurl);
		
		driver.manage().window().maximize();
	
	}

}


