package Rishi_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Rishi_pages.All_link;

public class All_link_test {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void open()
	{
		driver.get("https://rishiherbalindia.linker.store/");
	}
	
	@Test
	public void test()
	{
		All_link ob=new All_link(driver);
		ob.clkall();
		ob.clkhealth();
		ob.clksafety();
	}

}
