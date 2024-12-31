package Rishi_pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login {
	
	WebDriver driver;
	
	By myaccount1=By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span");
	By login1=By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[5]/a");
	By email1=By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[1]/input");
	By password1=By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[2]/input");
	By loginbt=By.xpath("//*[@id=\"cont-login-with-email\"]/form/button[1]");
	
	public login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void login1()
	{
		driver.findElement(myaccount1).click();
		
		WebElement login=driver.findElement(login1);
		Actions act=new Actions(driver);
		act.moveToElement(login);
		act.perform();
		login.click();
		
	}
	
	public void setvalues(String email,String password)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(email1));
		driver.findElement(email1).sendKeys(email);
		driver.findElement(password1).sendKeys(password);
	}
	
	public void loginclk()
	{
		driver.findElement(loginbt).click();
	}
	

}
