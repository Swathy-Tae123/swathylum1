package Selenium123;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findlist {
	
	ChromeDriver driver;
	
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void Test1()
	{
		List<WebElement> li = driver.findElements(By.tagName("a"));
		System.out.println(li.size());
	}

}
