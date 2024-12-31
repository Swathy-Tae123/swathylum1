package Selenium123;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffxpath {
	
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
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("swathy");
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input")).sendKeys("swathy@gmail.com");
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).click();
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[9]/td[3]/input")).sendKeys("abcd");
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[11]/td[3]/input")).sendKeys("abcd");
		driver.findElement(By.xpath("//div[@id='div_altemail']/table/tbody/tr[1]/td[3]/input")).sendKeys("tae@gmail.com");
		
	}

}
