package Workout;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoItUpload {

	ChromeDriver driver;
	
	@BeforeTest
	public void Set()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void Open()
	{
		driver.get("https://www.ilovepdf.com/pdf_to_word");
	}
	
	@Test
	public void Test1() throws IOException
	{
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		
		Runtime.getRuntime().exec("D:\\AutoitUpload5.exe");
	}
}
