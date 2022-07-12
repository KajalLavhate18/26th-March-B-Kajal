package ExcelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws  IOException {
		//create excel sheet and pass the path along with name and extension in file
	File myFile=new File("C:\\Users\\91860\\Desktop\\26March B batch\\Excel26marchB.xlsx");
	// using workbook factory class read excel sheet
	// how to read String value
	
	String name = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	System.out.println(name);
	
	String name1 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(name1);
	
	double number = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
	System.out.println(number);
	
	String Mychar = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
	System.out.println(Mychar);
	
	boolean value1 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(2).getCell(1).getBooleanCellValue();
	System.out.println(value1);
	
	
		
	
	
	
	}

}
