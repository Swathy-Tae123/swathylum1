package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon_Scroll_assignment {
	
ChromeDriver driver;
	
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void Open()
	{
		driver.get("https://www.amazon.in/");
	}
	
	@Test
	public void Test1()
	{
		WebElement privacy=driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[5]/ul/li[2]/a"));
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,10000)", "");
		//js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[5]/ul/li[2]/a")));
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		privacy.click();
	}

}
