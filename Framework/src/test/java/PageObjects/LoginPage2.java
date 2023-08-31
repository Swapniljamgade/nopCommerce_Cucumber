package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage2 
{
	public WebDriver driver;
	public LoginPage2(WebDriver drivers)
	{
		driver=drivers;
		PageFactory.initElements(drivers, this);
	}
	
  //webelements
	
	@FindBy(xpath="//i[@class='nav-icon far fa-user']")
	WebElement txtlnkCustomer_menu;
	
	@FindBy(xpath="//p[text()=' Customers']")
	WebElement txtlnkCustomer_menuitem;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	WebElement txtAddbtn;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement txtFirstName;
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement txtLastName;
	
	@FindBy(xpath="//div[@class='k-multiselect-wrap k-floatwrap']")
	WebElement txtCustomerRoles;
	
	@FindBy(xpath="//li[text()='Administrators']")
	WebElement listitemAdmistrators;
	
	@FindBy(xpath="//li[text()='Forum Moderators']")
	WebElement listitemForumModerators;
	
	@FindBy(xpath="//li[text()='Guests']")
	WebElement listitemGuests;
	
	@FindBy(xpath="//li[text()='vendors']")
	WebElement listitemvindors;
	
	@FindBy(xpath="//li[text()='Registered']")
	WebElement listitemRegistered;
	
	@FindBy(xpath="//*[@id=VendorId']")
	WebElement drpmgrofvendor;
	
	@FindBy(xpath="//input[@id='Gender_Male']")
	WebElement rdMaleGender;
	
	@FindBy(xpath="//input[@id='Gender_Female']")
	WebElement rdFeMaleGender;
	
	@FindBy(xpath="//input[@id='DateOfBirth']")
	WebElement txtDOB;
	
	@FindBy(xpath="//input[@id='AdminComment']")
	WebElement txtAdminContact;
	
	@FindBy(xpath="//button[@name='save']")
	WebElement btnsave;
	
	//page actions methods
	
	public void clickOnCustomerMenu()
	{
		txtlnkCustomer_menu.click();
	}
	
	public void clickOnCustomerMenuItem()
	{
		txtlnkCustomer_menuitem.click();
	}
	
	public void clickOnAddNew()
	{
		txtAddbtn.click();
	}
	
	public void SetEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void Setpassword(String pwd)
	{
		txtEmail.sendKeys(pwd);
	}
	
	
	public void setFirstName(String fname)
	{
		txtFirstName.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		txtLastName.sendKeys(lname);
	}
	
	public void setGender(String gender)
	{
		if(gender.equals("Male"))
		{
			rdMaleGender.click();
			
		}
		else if(gender.equals("Female"))
		{
			rdFeMaleGender.click();
		}
		else
		{
			rdFeMaleGender.click();
		}
		public void setDob(String dob)
		{
			txtDOB.sendKeys(dob);
		}
		
		public void setComapnyName(String comname)
		{
			txtCompanyName.sendKeys(comname);
		}
		
		public void setAdminContent(String content)
		{
			txtAdminContact.sendKeys(content);
		}
		
		public void setCustomerRole(String role)throws interruptedException
		{
			if(!role.equals("vendors"))
			{
				listitemvindors.click();
			}
			txtCustomerRoles.click();
			Thread.sleep(3000);
			if(role.equals("Administrators"))
			{
				listitemAdmistratators.click();
			}
			else if(role.equals("Guests")) 
			{
				listitemGuests.click();
			}
			else if(role.equals("Registered"))
			{
				listitemRegistered.click();
			}
			else if(role.equals("ForumModerators"))
			{
				listitemForumModerators.click();
			}
			if(role.equals("vendors"))
			{
				listitemvindors.click();
			}
			else
			{
				listitemGuests.click();
			}
		}
		
		//public void ClickOnSave()
		{
			btnsave.click();
		}
		
		
	}


}
