package PopUpStudy;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1PopUP {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91860\\Desktop\\26March B batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		String mainPageId = driver.getWindowHandle();
		System.out.println( mainPageId);
		
		driver.findElement(By.linkText("Try it Yourself")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Try it Yourself")).click();
		//to get id of all windows
		Set<String> allId = driver.getWindowHandles();
		
		for(String all:allId)
		{
			System.out.println(all);
			
			if(!all.equals(mainPageId))
			{
				driver.switchTo().window(all);
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
			}
		}
				
			
			driver.switchTo().window(mainPageId);
			driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[5]")).getText();
			Thread.sleep(1000);
			
			
				
				
				
				
		}
		
		
		
		
	

	}
	
