package PomKiteApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91860\\Desktop\\26March B batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");	
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		LoginPage login=new LoginPage(driver);
		login.sendUserName();
		login.sendPassword();
		login.clickLoginButton();
		Thread.sleep(1000);
		
		PinPage Pin=new PinPage(driver);
		Pin.sendPin();
		Pin.clickContinueButton();
		Thread.sleep(1000);
		
		HomePage HP=new HomePage(driver);
		HP.ValidateUserId();
		HP.clickLogoutButton();
		driver.close();
		
		
	}

}
