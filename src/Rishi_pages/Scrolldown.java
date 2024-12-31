package Rishi_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Scrolldown {
	
	WebDriver driver;
	
	By about_us=By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[2]/div/ul/li[2]/a");
	
	public Scrolldown(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void scrolldn()
	{
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	}
	
	public void clkabout()
	{
		driver.findElement(about_us).click();
	}
}
