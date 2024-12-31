package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CopyPasteAction {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void Set()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void Open()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void Test1()
	{
		WebElement name=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		name.sendKeys("abcd");
		
		WebElement id=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		
		Actions act=new Actions(driver);	
		act.keyDown(name, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(name, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.keyDown(id, Keys.CONTROL).sendKeys("v").keyDown(Keys.CONTROL);
		act.build().perform();
	}
	

	

}

