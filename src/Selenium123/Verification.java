package Selenium123;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification {
	
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
		//WebElement Logo=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		//Logo.isDisplayed();
		
		if(driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed())
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");

		}
		
		WebElement Checkbox=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input"));
		if(Checkbox.isSelected())
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");

		}
		
		WebElement Radiobutton=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
		if(Radiobutton.isSelected())
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");

		}

	}

}
