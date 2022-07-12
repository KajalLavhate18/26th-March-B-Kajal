package testNgStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass {
  @Test
  public void MyMethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91860\\Desktop\\26March B batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");	
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("Hi,method is running");
		Reporter.log("Hi,method is running this is reported output", true);
		
  }
  @Test
  public void MyMethod1() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91860\\Desktop\\26March B batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");	
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//System.out.println("Hi,method is running");
		//Reporter.log("Hi,method is running this is reported output", true);
}
}
