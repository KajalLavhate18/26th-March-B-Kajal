package PomKiteApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//1.data members
	@FindBy(id="userid")private WebElement userName;
	@FindBy(id="password")private WebElement password;
	@FindBy(xpath = "//button[@type='submit']")private WebElement logginbutton;
	
	//constructor
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//3.Method
	public void sendUserName()
	{
		userName.sendKeys("ELR321");
	}
	public void sendPassword() 
	{
		password.sendKeys("Dhana1111");
	}
	public void clickLoginButton()
	{
		logginbutton.click();
	}
	
	
	
	
	

}
