package KiteAppTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteApp {
	public static void main(String[] args) throws InterruptedException {


System.setProperty("webdriver.chrome.driver", "C:\\Users\\91860\\Desktop\\26March B batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");	
		
		Thread.sleep(2000);
	   WebElement UserName = driver.findElement(By.id("userid"));
	   UserName.sendKeys("ELR321");
	   WebElement Password = driver.findElement(By.id("password"));
	   Password.sendKeys("Dhana1111");
	   WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	   
	   LoginButton.click();
	   Thread.sleep(1000);
	   WebElement Pin = driver.findElement(By.id("pin"));
	   Pin.sendKeys("982278");
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	   Thread.sleep(200);
	  WebElement UserId = driver.findElement(By.xpath("//span[@class='user-id']"));
	  String actualUserId = UserId.getText();
	  String expectedUserId="ELR321";
	  
	  if(actualUserId.equals(expectedUserId)) {
		  System.out.println("User Id matching TC is PASSED");
	  }
		  else
		  {
			  System.out.println("User Id not matching TC is FAILED");
		  }
	  UserId.click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//a[@target='_self']")).click();
	  driver.close();
			  
		  
		  
		  
		  
		  
	  }
	  
	  
	  

	}


