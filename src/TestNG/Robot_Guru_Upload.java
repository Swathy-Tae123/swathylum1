package TestNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Robot_Guru_Upload {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void Set() 
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void Open()
	{
		driver.get("https://demo.guru99.com/test/upload/");
	}
	
	@Test
	public void Test1() throws AWTException
	{
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("E:/Swathy.pdf");
		//driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]]")).click();
		//System.out.println("swathy");
		//fileupload("E:/Swathy.pdf");
		driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	}

	/*private void fileupload(String v) throws AWTException
	{
		StringSelection selection=new StringSelection(v);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Robot rt=new Robot();
		rt.delay(6000);
		rt.keyPress(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_V);
		rt.keyRelease(KeyEvent.VK_V);
		rt.keyRelease(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		
	}*/

}
