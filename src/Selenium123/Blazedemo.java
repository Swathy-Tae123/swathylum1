package Selenium123;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blazedemo {
	
	ChromeDriver driver;
	
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://blazedemo.com/register");
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.name("name")).sendKeys("Swathy");
		driver.findElement(By.name("company")).sendKeys("luminar");
		driver.findElement(By.name("email")).sendKeys("swathy@gmail.com");
		driver.findElement(By.name("password")).sendKeys("swathypass");
		driver.findElement(By.name("password_confirmation")).sendKeys("swathypass");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button")).click();

	}
	
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//*[@id=\"app-navbar-collapse\"]/ul[2]/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("swathy@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("swathypass");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button")).click();
	}
	

}
