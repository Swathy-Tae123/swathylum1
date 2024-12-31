package Rishi_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Rishi_pages.skin;

public class skintest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void open()
	{
		driver.get("https://rishiherbalindia.linker.store/wishlist");
	}
	
	@Test
	public void test()
	{
		skin ob=new skin(driver);
		ob.clkskin();
		ob.movetoimage();
		ob.clkadd();
		ob.viewlist();
	}

}
