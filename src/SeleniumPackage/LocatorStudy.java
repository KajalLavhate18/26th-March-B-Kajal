package SeleniumPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStudy {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91860\\Desktop\\26March B batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver D=new ChromeDriver();
		
		D.get("https://vctcpune.com/selenium/practice.html");
		D.findElement(By.xpath("//p[text()='Don't have an account? ']")).click();
		D.findElement(By.xpath("//input[@value='Radio3']")).click();
		D.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("hii kajal");
		
		
	}

}
