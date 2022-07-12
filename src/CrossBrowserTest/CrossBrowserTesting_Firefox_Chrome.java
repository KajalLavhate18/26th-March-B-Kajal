package CrossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting_Firefox_Chrome {
	@Parameters("Browser name")
	
	 @Test 
	  public void myMethod(String name) throws InterruptedException
	  {
		WebDriver driver = null;
		if(name.equals("Firefox"))
		{

			 System.setProperty("webdriver.gecko.driver", "C:\\Users\\91860\\Desktop\\26March B batch\\geckodriver.exe");
				
				 driver=new FirefoxDriver();
			
			
		}
		 else if (name.equals("Chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\91860\\Desktop\\26March B batch\\chromedriver_win32 (1)\\chromedriver.exe");
				
			 driver = new ChromeDriver();
			
		}
	  
	  driver.get("https://vctcpune.com/");
			Thread.sleep(1000);
			driver.close();
	  
 
}
	 
}
