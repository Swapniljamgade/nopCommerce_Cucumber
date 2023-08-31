package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1
{
	WebDriver driver;
	public LoginPage1(WebDriver drivers)
	{
	driver=drivers;
	PageFactory.initElements(drivers, this);
	}
	@FindBy(id="Email")
	WebElement txtEmail;
	
	@FindBy(id="Password")
	WebElement txtpassword;
	
	@FindBy(xpath="//button[text()='Log in']")
	WebElement btnLogin;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement linkLogout;
	
	public void setUsername(String uname)
	{
		txtEmail.clear();
		txtEmail.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtEmail.clear();
		txtEmail.sendKeys(pwd);
	}
	
	public void clickonLogin()
	{
		btnLogin.click();
		
	}
	
	public void clickOnLogout()
	{
		linkLogout.click();
		
	}
			

}
