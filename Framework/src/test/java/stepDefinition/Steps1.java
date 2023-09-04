package stepDefinition;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PageObjects.LoginPage1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps1 

{
	public WebDriver driver;
	public LoginPage1 lp;


	@Given("User Launch chrome Browser")
	public void user_launch_chrome_browser() 
	{
		//ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		lp=new LoginPage1(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url)
	{
		driver.get(url);

	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) 
	{
		lp.setUsername(email);
		lp.setPassword(password);

	}

	@When("Click on Login")
	public void click_on_login()
	{
		lp.clickonLogin();

	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String title)
	{
		if (driver.getPageSource().contains("log in was unsuccesful"))
		{
			driver.close();
			Assert.assertTrue(false);
		}
		else 
		{
			Assert.assertEquals(title,driver.getTitle());
		}

	}

	@When("User Click on Log Out link")
	public void user_click_on_log_out_link() throws InterruptedException
	{
		lp.clickOnLogout();
		Thread.sleep(3000);
	}

	@Then("close browser")
	public void close_browser() 
	{
		driver.quit();
	}
}


