package testNgStudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class My_TestNg_Class {
  @Test
  public void Facebook() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91860\\Desktop\\26March B batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		Reporter.log("Hello,Practice hard ",true);
		
		
		
  }
  @Test
  public void KiteApp() throws EncryptedDocumentException, IOException, InterruptedException
  {
	  File myFile=new File("C:\\\\Users\\\\91860\\\\Desktop\\\\26March B batch\\\\Excel26marchB.xlsx");
	 Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
	String UserName = mySheet.getRow(5).getCell(0).getStringCellValue();
	String PassWord = mySheet.getRow(5).getCell(1).getStringCellValue();
	
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\91860\\Desktop\\26March B batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(200);
		
		driver.manage().window().maximize();
		
		
		WebElement UID = driver.findElement(By.id("userid"));
		WebElement PWD = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		UID.sendKeys(UserName);
		PWD.sendKeys(PassWord);
		Thread.sleep(500);
		LoginButton.click();
		Reporter.log("Get Success",true);
		
		
		
		
		
	
	
	  
  
  
  
	  
  }
  
}
