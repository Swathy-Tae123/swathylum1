package Workout;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandle {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void Set()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void Open()
	{
		driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN885G0&p=amazon.in");
	}
	
	@Test
	public void Test1()
	{
		driver.manage().window().maximize();
		String parentwindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/ol/li[2]/div/div[1]/div[1]/a/h3/span")).click();
		
		Set<String> allwindowhandles=driver.getWindowHandles();
		
		for(String handle:allwindowhandles)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]")).click();
			}
		}
	}

}
