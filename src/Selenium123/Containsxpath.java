package Selenium123;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Containsxpath {
	
	ChromeDriver driver;
	
	@Before
	public void open() 
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void Test1()
	{
		//driver.findElement(By.xpath("//*[contains(@id,'u_0_5')]")).click();
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Log in')]")).click();
	}

}
