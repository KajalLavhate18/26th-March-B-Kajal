package CrossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	//@Parameter("browser name")
	
  @Test 
  public void myMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91860\\Desktop\\26March B batch\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");	
		driver.manage().window().maximize();
		//Thread.sleep(2000);
  }
	@Test
	  public void myMethod1() {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\91860\\Desktop\\26March B batch\\geckodriver.exe");
			
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/");	

			//Thread.sleep(2000);
	}
	
}
	

	
  

