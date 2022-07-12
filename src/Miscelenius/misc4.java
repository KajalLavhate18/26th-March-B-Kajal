package Miscelenius;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class misc4 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91860\\Desktop\\26March B batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ixigo.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/header/div/div[1]/span[2]/nav/span[1]/a/span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[6]/div/div/div[1]/div/div[1]/input")).sendKeys("Pune");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[6]/div/div/div[3]/div/div[1]/input")).sendKeys("Dubai Phata");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[6]/div/div/div[4]/div/div[1]/div/input")).click();
		
	}

}
