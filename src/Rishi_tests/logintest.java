package Rishi_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Rishi_pages.login;

public class logintest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void openurl()
	{
		driver.get("https://rishiherbalindia.linker.store/");
	}
	
	@Test
	public void Test1()
	{
		driver.manage().window().maximize();
		login ob=new login(driver);
		ob.login1();
		ob.setvalues("swathys1@gmail.com", "Swathy@1234");
		ob.loginclk();
	}
	


}
