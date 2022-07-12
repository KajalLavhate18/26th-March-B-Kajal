package KiteBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	protected WebDriver driver;
	public void browserSetUp()
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\91860\\Desktop\\26March B batch\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("https://kite.zerodha.com/");
		
	}

	
}
