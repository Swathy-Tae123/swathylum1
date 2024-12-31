package Rishi_pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	WebDriver driver;
	
	By privacy=By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[4]/div/ul/li[1]/a");
	
	public Screenshot(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void scrolldn()
	{
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	}
	
	public void scrnshot() throws Exception 
	{
		WebElement Privcy=driver.findElement(privacy);
		File Privcyss=Privcy.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(Privcyss,new File("./swathy_srnsht//privacyimage.png"));
	}
}
