package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class DragDrop {
		
		ChromeDriver driver;
		
		@BeforeTest
		public void set()
		{
			driver=new ChromeDriver();
		}
		
		@BeforeMethod
		public void Open()
		{
			driver.get("https://demoqa.com/droppable");
		}
		
		@Test
		public void Test1()
		{
			WebElement Drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
			WebElement Drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
			driver.manage().window().maximize();
			Actions act=new Actions(driver);
			act.dragAndDrop(Drag, Drop);
			act.perform();
			
			String text=Drop.getText();
			System.out.println(text);
			
			if(text.equals("Dropped!"))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
	
			}
		}
		
	
	}
