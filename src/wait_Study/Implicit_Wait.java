package wait_Study;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\91860\\Desktop\\26March B batch\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://vctcpune.com/");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			//implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			driver.close();

	}

}
