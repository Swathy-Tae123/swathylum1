package Rishi_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class search {
	
	WebDriver driver;
	
	By search1=By.xpath("//*[@id=\"search\"]/input");
	By click=By.xpath("//*[@id=\"search\"]/span/button/i");
	
	public search(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void passvalues()
	{
		WebElement searchh=driver.findElement(search1);
		searchh.sendKeys("Herbal agro Growth Booster");
	}
	public void click1()
	{
		driver.findElement(click).click();
	}

}
