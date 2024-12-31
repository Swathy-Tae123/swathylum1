package TestNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru_Windohandle {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void Set()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void Open()
	{
		driver.get("https://demo.guru99.com/popup.php");
	}
	
	@Test
	public void test()
	{
		driver.manage().window().maximize();
		String Title=driver.getTitle();
		System.out.println(Title);
		
		String parentwindow=driver.getWindowHandle();
		driver.findElement(By.xpath("/html/body/p[1]/a")).click();
		
		Set<String> nextwindowhandles=driver.getWindowHandles();
		
		for(String next:nextwindowhandles)
		{
			if(!next.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(next);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("swathys675@gmail.com");
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
				driver.close();
	
			}
			
		}
		
		driver.switchTo().window(parentwindow);
		WebDriver driver1=driver.switchTo().newWindow(WindowType.WINDOW);
		driver1.get("https://www.google.com/");
		driver1.close();
	}

}
