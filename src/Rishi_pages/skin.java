package Rishi_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class skin {
	
	WebDriver driver;
	
	By skin1=By.xpath("//*[@id=\"menu\"]/ul/li[4]/a");
	By image=By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img");
	By wishlist=By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/div[2]/div[2]/ul/li[1]/button/span");
	By viewlist=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span");
	
	public skin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clkskin()
	{
		driver.findElement(skin1).click();
	}
	
	public void movetoimage()
	{
		WebElement image1=driver.findElement(image);
		Actions act=new Actions(driver);
		act.moveToElement(image1);
		act.perform();
	}
	
	public void clkadd()
	{
		driver.findElement(wishlist).click();
	}
	
	public void viewlist()
	{
		driver.findElement(viewlist).click();
	}
}
