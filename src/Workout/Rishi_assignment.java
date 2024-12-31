package Workout;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rishi_assignment {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void open()
	{
		driver.get("https://rishiherbalindia.linker.store/");
	}
	
	@Test
	public void Test1() throws Exception
	{
		WebElement myaccount=driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span"));
		myaccount.click();
		
		WebElement register=driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[4]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(register);
		act.perform();
		register.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input")));
        
        WebElement emailid = driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input"));
        emailid.sendKeys("swathys22@gmail.com");
        WebElement password = driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input"));
        password.sendKeys("Swathi@1234");
        driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[3]/label/input")).click();
        
        WebElement signup = modal.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/button"));
        signup.click();
       
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement modal1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("mobile_no")));
        driver.findElement(By.name("mobile_no")).sendKeys("9745246163");
        driver.findElement(By.xpath("//*[@id=\"ls-veriy-mobile-overlay-v1\"]/div/div/div[2]/div[1]/form")).click();
        
        Thread.sleep(500);
        
        //driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[1]/button/span")).click();
	}
	
	public void login()
	{
		driver.findElement(By.xpath("//*[@id=\"register-model-signin-link\"]")).click();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"cont-login-with-email\\\"]/form/div[1]/input")));
		driver.findElement(By.xpath("//*[@id=\\\"cont-login-with-email\\\"]/form/div[1]/input")).sendKeys("swathys22@gmail.com");
		driver.findElement(By.xpath("//*[@id=\\\"cont-login-with-email\\\"]/form/div[2]/input")).sendKeys("Swathi@1234");	 
	}
	
	}
	


