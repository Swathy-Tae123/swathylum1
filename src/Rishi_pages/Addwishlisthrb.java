package Rishi_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Addwishlisthrb {
	
	WebDriver driver;
	
	By hrbwishlist=By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/div[2]/div[2]/ul/li[1]/button/span");
	By wishlist1=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span");
	By image=By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img");
	
	public Addwishlisthrb(	WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void addwish()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)", "");
		WebElement hrbwish=driver.findElement(image);
		Actions act=new Actions(driver);
		act.moveToElement(hrbwish);
		act.perform();
	}
	public void clkwishl()
	{
		driver.findElement(hrbwishlist).click();
	}
	public void viewwishlist()
	{
		driver.findElement(wishlist1).click();
	}

}
