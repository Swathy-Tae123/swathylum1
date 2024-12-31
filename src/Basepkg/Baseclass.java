package Basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	
	public WebDriver driver;
	
	@BeforeTest
	public void Setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void Urlopen()
	{
		driver.get("https://www.facebook.com/");
	}

}
