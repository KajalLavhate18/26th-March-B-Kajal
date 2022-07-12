package Inframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame_Study {

	public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\91860\\Desktop\\26March B batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://skpatro.github.io/demo/iframes/");
		Thread.sleep(2000);
		//find element by linkText
		String text = driver.findElement(By.xpath("//a[text()='Pavilion']")).getText();
		System.out.println(text);
		System.out.println("===================================");
		
		//switch to main frame to frame 1
	      driver.switchTo().frame("Frame1");
	      
	     String Text1 = driver.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
	     
	     System.out.println(Text1);
	     
	     System.out.println("===================================");
	     
	     //switch to frame 1 to main frame
	     driver.switchTo().parentFrame();
	     String Text2 = driver.findElement(By.xpath("//a[text()='Blogger']")).getText();
	     System.out.println(Text2);
	     
	     System.out.println("======================================");
	     
	     //switch to main frame to frame 2
	     
	     driver.switchTo().frame("Frame2");
	     String linkText = driver.findElement(By.linkText("Category3")).getText();
	     System.out.println(linkText);
	     
	     System.out.println("======================================");
	     //switch to frame2 to main frame
	     driver.switchTo().parentFrame();
	     String Text3 = driver.findElement(By.linkText("Pavilion")).getText();
	     System.out.println(Text3);
	     System.out.println("This is change for git");
	     
	     System.out.println("==========================================");
	     
	     
	     
	     
	  
		

	}

}
