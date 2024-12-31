package Rishi_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Rishi_pages.login;
import Rishi_pages.responcecode;

public class responcecodetest {
	
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
	public void Test1() throws Exception
	{
		driver.manage().window().maximize();
		responcecode ob=new responcecode(driver);
		ob.respnscd();
	}
}
