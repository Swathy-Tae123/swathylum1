package Workout;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Udemy {
ChromeDriver driver;
	
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
	}
	
	@Test
	public void Test1()
	{
		//driver.findElement(By.xpath("//body[@id='www-wikipedia-org']/main/nav[1]/div[1]/a")).click();
		//driver.findElement(By.xpath("//body[@id='www-wikipedia-org']/main/nav[2]/div[1]/button/i[1]")).click();
		driver.findElement(By.xpath("//body[@id='www-wikipedia-org']/main/nav[1]/div[6]/a/strong")).click();
	}
	


}
