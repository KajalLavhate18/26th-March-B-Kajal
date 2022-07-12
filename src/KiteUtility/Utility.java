package KiteUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	
	public static String dataReadingFromExcel(int Row,int Cell) throws EncryptedDocumentException, IOException
	{
		File myFile=new File("C:\\Users\\91860\\Desktop\\26March B batch\\Excel26marchB.xlsx");
		Sheet MySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		String value = MySheet.getRow(Row).getCell(Cell).getStringCellValue();
		return value;
	}
	public static void pickScreenshot(WebDriver driver,String SSID) throws IOException {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\91860\\Desktop\\26March B batch\\ScreenshotMyScreenshot"+SSID+".png");
		FileHandler.copy(src, dest);
		
		
	}
	
	

}
