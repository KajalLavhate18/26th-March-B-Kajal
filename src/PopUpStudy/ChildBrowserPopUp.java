package PopUpStudy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\91860\\Desktop\\26March B batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		String mainPageId = driver.getWindowHandle();//id of main page
		
		System.out.println(mainPageId);
		
		System.out.println("=================================================");
		
		//to open child window
		driver.manage().window().maximize();
	driver.findElement(By.name("NewWindow")).click();
	Thread.sleep(5000);
	Set<String> allPageId = driver.getWindowHandles();
	Iterator<String> it = allPageId.iterator();
	Thread.sleep(5000);
	String mainPageID = it.next();
	System.out.println(mainPageID);
	String childPageId = it.next();
	System.out.println(childPageId);
	driver.switchTo().window(childPageId);
	driver.manage().window().maximize();
	//Thread.sleep(3000);
	driver.findElement(By.name("s")).sendKeys("Selenium_Study");
		
	}

}
