package Scrolling;

//import java.time.Duration;

//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingStudy {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91860\\Desktop\\26March B batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");	
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		//WebElement Katraj = driver.findElement(By.xpath("//strong[text()='Katraj Branch']"));
		 
		//JavascriptExecutor e = (JavascriptExecutor)driver;
		//e.executeScript("arguments[0].scrollintoView(true)",Katraj);
		

	}

}
