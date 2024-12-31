package Rishi_pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register {
	
	WebDriver driver;
	By rishimyaccount=By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span");
	By rishiregister=By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[4]/a");
	By rishiemail=By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input");
	By rishipassword=By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input");
	By rishiregistrradio=By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[3]/label/input");
	By rishisignup=By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/button");
	
	
	public Register(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void myaccountclk()
	{
		driver.findElement(rishimyaccount).click();
		
		WebElement register=driver.findElement(rishiregister);
		Actions act=new Actions(driver);
		act.moveToElement(register);
		act.perform();
		register.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input")));
        
        WebElement emailid = driver.findElement(rishiemail);
        emailid.sendKeys("swathys17@gmail.com");
        WebElement password = driver.findElement(rishipassword);
        password.sendKeys("Swathy@1234");
        driver.findElement(rishiregistrradio).click();
        
        WebElement signup = modal.findElement(rishisignup);
        signup.click();
       
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement modal1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("mobile_no")));
        driver.findElement(By.name("mobile_no")).sendKeys("9745246163");

	}
}

