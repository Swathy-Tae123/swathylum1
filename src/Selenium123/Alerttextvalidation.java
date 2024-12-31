package Selenium123;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerttextvalidation {
	
	ChromeDriver driver;
	
	@Before
	public void Open()
	{
		driver=new ChromeDriver();
		driver.get("file:///D:/newprgrm.html");
	}
	
	@Test
	public void Test1()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String actual=a.getText();
		String Expected="Hello! I am an alert box!!";
		
		if(actual.equals(Expected))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");

		}
		a.accept();
	}


}
