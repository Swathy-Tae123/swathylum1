package Rishi_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class All_link {
	
	WebDriver driver;
	
	By all=By.xpath("//*[@id=\"menu\"]/ul/li[1]/a");
	By health=By.xpath("//*[@id=\"menu\"]/ul/li[2]/a");
	By safety=By.xpath("//*[@id=\"menu\"]/ul/li[3]/a");
	
	public All_link(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clkall()
	{
		driver.findElement(all).click();
	}
	public void clkhealth()
	{
		driver.findElement(health).click();
	}
	public void clksafety()
	{
		driver.findElement(safety).click();
	}

}
