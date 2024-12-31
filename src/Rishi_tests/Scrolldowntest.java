package Rishi_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Rishi_pages.Scrolldown;

public class Scrolldowntest {
	
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
	public void test1()
	{
		Scrolldown ob=new Scrolldown(driver);
		ob.scrolldn();
		ob.clkabout();
	}

}
