package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Fbloginpage;

public class Fblogintest {
	
	WebDriver driver;
	@BeforeTest
	public void Setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void Urlpoen()
	{
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void testlogin()
	{
		Fbloginpage ob=new Fbloginpage(driver);
		ob.Setvalues("swathy@gmail.com", "tae");
		ob.login();
	}

}
