package wait_Study;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91860\\Desktop\\26March B batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");	
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(3000));
		WebElement aboutUs = driver.findElement(By.xpath("(//a[text()='About Us'])[1]"));
		wait.until(ExpectedConditions.visibilityOf(aboutUs));
		aboutUs.click();
		
		

	}

}
