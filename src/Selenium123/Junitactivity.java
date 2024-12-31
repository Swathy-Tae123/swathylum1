package Selenium123;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitactivity {
	
	ChromeDriver driver;
	
	@Before
	public void Openbrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	
	@Test
	public void test1()
	{
		String Actualresult=driver.getTitle();
		System.out.println(Actualresult);
		String Expectedresult="amazon";
		
		if(Actualresult.equals(Expectedresult))
		{
			System.out.println("Pass");

		}
		else
		{
			System.out.println("Fail");
		}
	}
	
	@Test
	public void test2()
	{
		String Actualresult=driver.getPageSource();
		System.out.println(Actualresult);
		
		if(Actualresult.contains("amazon"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
	}
	}
	
	@After
	public void closebrowser()
	{
	
	}

}
