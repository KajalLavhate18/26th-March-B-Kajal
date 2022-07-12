package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91860\\Desktop\\26March B batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("KAJAL");
		
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("LAVHATE");
		
		Thread.sleep(2000);
		//To Enter Mobile Number
		  driver.findElement(By.name("reg_email__")).sendKeys("8551925642");
		  Thread.sleep(2000);
		  //To Enter Password
		    WebElement password = driver.findElement(By.id("password_step_input"));
		   
		    
		    password.sendKeys("KSR@2222");
		    Thread.sleep(5000);
		    
		    //LISTBOX HANDLING PROCESS
		    //DAY
		    //IDENTIFY
		    WebElement day = driver.findElement(By.id("day"));
		    Select s=new Select(day);
		   // s.selectByVisibleText("18");
		   //s.selectByValue("18");
		    s.selectByIndex(17);
		    
		    //for month
		    WebElement month = driver.findElement(By.id("month"));
		    Select s1=new Select(month);
		    //s1.selectByVisibleText("Sep");
		   // s1.selectByValue("9");
		    s1.selectByIndex(8);
		    
		    //for year
		    WebElement year = driver.findElement(By.id("year"));
		   Select s2=new Select(year);
		   // s2.selectByValue("1997");
		    s2.selectByVisibleText("1997");
		    // To enter gender
		    driver.findElement(By.xpath("//label[text()='Female']")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		    
		    
		  
		  
		  
	}
		
		

}
