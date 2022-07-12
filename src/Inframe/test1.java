package Inframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91860\\Desktop\\26March B batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		
		Thread.sleep(5000);
		 WebElement source = driver.findElement(By.xpath("//button[@type='button']"));
		 source.click();
		driver.switchTo().defaultContent();//focus to parent frame
		 driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		
		
		

	}

}
