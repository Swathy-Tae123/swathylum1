package Selenium123;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redifflink2 {

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
		WebElement test=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
		String Expected="Create my account >>";
		
		
			String Button=test.getAttribute("value");
			System.out.println(Button);
			
			if(Button.equals(Expected))
			{
				System.out.println("Pass");
				
			}
			else
			{
				System.out.println("fail");
			}
		}
	}

