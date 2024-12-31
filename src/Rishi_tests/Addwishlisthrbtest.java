package Rishi_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Rishi_pages.Addwishlisthrb;

public class Addwishlisthrbtest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void open()
	{
		driver.manage().window().maximize();
		driver.get("https://rishiherbalindia.linker.store/search?query=Herbal+agro+Growth+Booster");
	}
	
	@Test
	public void Test1()
	{
		Addwishlisthrb ob=new Addwishlisthrb(driver);
		ob.addwish();
		ob.clkwishl();
		ob.viewwishlist();
	}

}
