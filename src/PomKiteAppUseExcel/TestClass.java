package PomKiteAppUseExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		File myFile=new File("C:\\Users\\91860\\Desktop\\26March B batch\\Excel26marchB.xlsx");
		Sheet MySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		 String id= MySheet.getRow(5).getCell(0).getStringCellValue();
		 String pwd = MySheet.getRow(5).getCell(1).getStringCellValue();
		 String pin1 = MySheet.getRow(5).getCell(2).getStringCellValue();
		
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91860\\Desktop\\26March B batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");	
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		LoginPage login=new LoginPage(driver);
		login.sendUserName(id);
		login.sendPassword(pwd);
		login.clickLoginButton();
		Thread.sleep(1000);
		
		PinPage Pin=new PinPage(driver);
		Pin.sendPin(pin1);
		Pin.clickContinueButton();
		Thread.sleep(1000);
		
		HomePage HP=new HomePage(driver);
		HP.ValidateUserId();
		HP.clickLogoutButton();
		driver.close();
		
		
	}

}
