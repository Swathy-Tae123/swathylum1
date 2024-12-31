package TestNG;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon_windohandle_Assignment {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void Open()
	{
		driver.get("https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_9cz4f6pmzm_e&adgrpid=1315017565416290&hvadid=82188862071561&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=149317&hvtargid=kwd-82189528360928:loc-90&hydadcr=5658_2377273");
	}
	
	@Test
	public void Test1()
	{
		driver.manage().window().maximize();
		String parentwindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobile Phone",Keys.ENTER);
		
		String Title=driver.getTitle();
		System.out.println(Title);
		
		if(Title.equals("Amazon.in : Mobile Phone"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/a[1]/div[1]/img[1]")).click();
		
		
		Set<String> allwindowhandles=driver.getWindowHandles();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)","");
		
		for(String handle:allwindowhandles)
		{
			System.out.println(handle);
			
			if(!handle.equalsIgnoreCase(parentwindow))
			{	
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[37]/div[1]/span[1]/span[1]/span[1]/input[1]")).click();
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[8]/div[3]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/form[1]/span[1]/span[1]/input[1]")));
				driver.findElement(By.xpath("/html[1]/body[1]/div[8]/div[3]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/form[1]/span[1]/span[1]/input[1]")).click();
			}
		}
	}

}
