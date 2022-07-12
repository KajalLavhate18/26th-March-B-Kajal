package CrossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firefox_Test {
  @Test
  public void myMethod() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\91860\\Desktop\\26March B batch\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");	

		//Thread.sleep(2000);
  }
}
