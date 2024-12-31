package Selenium123;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebooksignup {
	
	ChromeDriver driver;
	
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
	}
	
	@Test
	public void Test1()
	{
		WebElement Dropdown=driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select day=new Select(Dropdown);
		day.selectByValue("5");
		
		WebElement Dropdown1=driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select month=new Select(Dropdown1);
		month.selectByVisibleText("Mar");
		
		WebElement Dropdown2=driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select year=new Select(Dropdown2);
		year.selectByIndex(3);
		
		
	}

}
