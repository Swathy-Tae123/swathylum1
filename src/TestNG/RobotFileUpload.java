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

public class RobotFileUpload {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void Open()
	{
		driver.get("https://www.ilovepdf.com/pdf_to_word");
	}
	
	@Test
	public void Test1() throws AWTException
	{
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		fileupload("D:\\Swathy S (1).pdf");
	}
	public void fileupload(String p) throws AWTException
	{
		StringSelection Strselect=new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Strselect, null);
		
		Robot robt=new Robot();
		robt.delay(3000);
		robt.keyPress(KeyEvent.VK_CONTROL);
		robt.keyPress(KeyEvent.VK_V);
		robt.keyRelease(KeyEvent.VK_V);
		robt.keyRelease(KeyEvent.VK_CONTROL);
		robt.keyPress(KeyEvent.VK_ENTER);
		robt.keyRelease(KeyEvent.VK_ENTER);
	}
	}
	


