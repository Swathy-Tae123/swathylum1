package Selenium123;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffdropdown {
	
	ChromeDriver driver;
	
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void Test1()
	{
		//CharSequence[] select_by_value;
		
		//Select ob=new Select(web);
		//Object dropdown = select(web);
		
		
		//Class<? extends Select> s=ob.getClass();
		//System.out.println(s.getClasses());
	}

	

	
	
	

}
