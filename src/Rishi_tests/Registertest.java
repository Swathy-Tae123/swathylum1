package Rishi_tests;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Rishi_pages.Register;

public class Registertest {
	
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
		Register ob=new Register(driver);
		ob.myaccountclk();
	}

}
