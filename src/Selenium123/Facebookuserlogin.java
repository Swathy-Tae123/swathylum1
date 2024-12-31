package Selenium123;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookuserlogin {

	ChromeDriver driver;
	
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.name("email")).sendKeys("swathys675@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("abcd");
		driver.findElement(By.name("login")).click();
	}
}
