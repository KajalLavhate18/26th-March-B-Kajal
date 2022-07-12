

package AnnotationStudy;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;


public class Annotation_study1 {
	

	 @BeforeClass
		
	
	  public void URL_Launched() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91860\\Desktop\\26March B batch\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://kite.zerodha.com/");
		 driver.manage().window().maximize();
		 Reporter.log("URL is Launched",true);
	  }
  @Test
  public void Login_To_KiteApp () {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91860\\Desktop\\26March B batch\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  //.driver.get("https://kite.zerodha.com/");
	  driver.findElement(By.id("userid")).sendKeys("ELR321");
	  driver.findElement(By.id("password")).sendKeys("Dhana1111");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  Reporter.log("Login successfull",true);
  }
  @AfterMethod
  public void Pin_for_KiteApp() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91860\\Desktop\\26March B batch\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  Thread.sleep(1000);
	  driver.findElement(By.id("pin")).sendKeys("982278");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  Thread.sleep(500);
	  driver.findElement(By.xpath("//a[@target='_self']")).click();
	  Reporter.log("Pin inserted",true);
	  }
@AfterClass
  public void LogOut_KiteApp() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\91860\\Desktop\\26March B batch\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	Thread.sleep(200);
	driver.close();
	Reporter.log("Browser closed",true);
	
  }

}
