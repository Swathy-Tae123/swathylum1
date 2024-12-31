package Selenium123;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_hw {
	
	ChromeDriver driver;
	
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_6fg86alebb_e&adgrpid=1329311215562463&hvadid=83082217950550&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=149441&hvtargid=kwd-83082880600838:loc-90&hydadcr=5659_2377257");
	}
	
	@Test
	public void Test1()
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobiles");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	}
	
	@Test
	public void Test2()
	{
		driver.findElement(By.xpath("//div[@id='nav-cart-count-container']/span[2]")).click();
		driver.navigate().back();
	}
	@Test
	public void Test3()
	{
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header/div/div[1]/div[3]/div/a[2]")).click();
		driver.findElement(By.xpath("//*[contains(@name,'email')]")).sendKeys("swathys675@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[5]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id='nav-main']/div[1]/a[1]/i")).click();
		
	}
	
	
}
