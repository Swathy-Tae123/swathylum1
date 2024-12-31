package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.FBloginPF;

public class FblogintestPF {
	WebDriver driver;
	@BeforeTest
	public void Setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void Open()
	{
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void testlogin()
	{
		FBloginPF obj=new FBloginPF(driver);
			obj.setvalues("swathy@gmail.com","abcd");
			obj.login();
			
		}


}
