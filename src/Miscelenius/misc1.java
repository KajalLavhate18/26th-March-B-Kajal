package Miscelenius;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class misc1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91860\\Desktop\\26March B batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");	
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("BMW");
		Thread.sleep(2000);
		List<WebElement> bmw = driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]//li"));
		
		System.out.println(bmw.size());
		
		for(WebElement k:bmw)
		{
			System.out.println(k.getText());
			String k1 = k.getText();
			String k3 = "bmw g310r";
			if(k1.equals(k3))
			{
				k.click();
				break;
			}
			
			
			}
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(2000);
		List<WebElement> img = driver.findElements(By.xpath("//div[@class='mJxzWe']//img"));
		System.out.println(img.size());
		

}
}
