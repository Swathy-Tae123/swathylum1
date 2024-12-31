package Selenium123;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {
	
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
		WebElement Dropdown=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select day=new Select(Dropdown);
		day.selectByVisibleText("01");
		List<WebElement> li = day.getOptions();
		System.out.println("Day :"+li.size());
		
		WebElement Dropdown1=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select month=new Select(Dropdown1);
		month.selectByValue("12");
		List<WebElement> li1 = month.getOptions();
		System.out.println("month :"+li1.size());
		
		WebElement Dropdown2=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select year=new Select(Dropdown2);
		year.selectByIndex(3);
		List<WebElement> li2 = year.getOptions();
		System.out.println("year :"+li2.size());
		
		
	}
	

}
