package Serial_Parallel_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Serial_TestNg {
  @Test
  public void kiteApp(){
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91860\\Desktop\\26March B batch\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://kite.zerodha.com/");	
	driver.manage().window().maximize();
	//Thread.sleep(2000);() {
  }
}
