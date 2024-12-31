package Selenium123;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {
	
	ChromeDriver driver;
	
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("file:///D:/newprgrm.html");
	}
	
	@Test
	public void Test1()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Nibin");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("swathy");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
	}

}
