package TestNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoitFileUpload {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void Open()
	{
		driver.get("https://www.freeconvert.com/");
	}
	
	@Test
	public void Test1() throws Exception
	{
		driver.findElement(By.xpath("//*[@id=\"file\"]")).click();
		
		Runtime.getRuntime().exec("D:\\AutoitUpload4.exe");
	}
}
