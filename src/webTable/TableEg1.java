package webTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEg1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91860\\Desktop\\26March B batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		//how to find no of rows in table
		
		 List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		 int totalNumOfRows = rows.size();
		 System.out.println("Total number of Rows "+totalNumOfRows);
		 
		 System.out.println("======================================");
		 
		 for(WebElement R:rows)
		 {
			 System.out.println(R.getText());
			 
		 }
		 System.out.println("=============================================");
		 //how to find no of columns of table
		 
		 List<WebElement>column = driver.findElements(By.xpath("//table//tr//th"));
		 int totalNumOfColumn = column.size();
		 System.out.println("total number of columns "+totalNumOfColumn);
		 
		 System.out.println("=============================================");
		Iterator<WebElement> allColumn = column.iterator();
		while(allColumn.hasNext())
		{
			System.out.print(allColumn.next().getText()+"");
			System.out.println();
		}
			
		 
	}
	

}
