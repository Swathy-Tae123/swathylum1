package Selenium123;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Janasya {
	
	ChromeDriver driver;
	
	@Before
	public void Open()
	{
		driver=new ChromeDriver();
		driver.get("https://janasya.com/");
	}
	
	@Test
	public void test1()
	{
		String actualresult=driver.getTitle();
		System.out.println(actualresult);
		String expectedresult="Janasya";
		
		if(actualresult.equals(expectedresult))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	@Test
	public void test2()
	{
		String actualresult=driver.getPageSource();
		System.out.println(actualresult);
		
		if(actualresult.contains("Janasya"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	@After
	public void close()
	{
		
	}
	

}
