package KitePOM_Using_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class ValidateKiteAppUserName{
	WebDriver driver;
	LoginPage Login;
	PinPage Pin;
	HomePage home;
	 @BeforeClass
	  public void LaunchBrowser()
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\91860\\Desktop\\26March B batch\\chromedriver_win32 (1)\\chromedriver.exe");
			 driver= new ChromeDriver();
			driver.get("https://kite.zerodha.com/");
			home= new HomePage(driver);
	  }
 
     @BeforeMethod
     public void LoginToKiteApp() 
     {
    	 Login=new LoginPage(driver);
    	 Login.sendUserName();
    	 Login.sendPassword();
    	 Login.clickLoginButton();
    	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
    	 Pin=new PinPage(driver);
    	 Pin.sendPin();
    	 Pin.clickContinueButton();
    	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
     }
     
     @Test
     public void validateUserName()
     {
    	String actualUserId = home.actualUId();
    	String ExpectedUserID = "ELR321";
    	Assert.assertEquals(actualUserId, ExpectedUserID,"actualUserId and ExpectedUserID are not matching TC Failed");
    	 
     }

     @AfterMethod
     public void LogoutFromKiteApp() throws InterruptedException {
    	 home.clickLogoutButton();
    	 
     }

 

     @AfterClass
      public void CloseBrowser() {
    	 driver.close();
    	 
     }

}
