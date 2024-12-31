package Workout;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rishi_assignment_fromlogin {
	
WebDriver driver;
String baseurl="https://rishiherbalindia.linker.store/";
	
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
	public void login()
	{
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span")).click();
		

		WebElement login=driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[5]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(login);
		act.perform();
		login.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")));
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")).sendKeys("swathys1@gmail.com");
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")).sendKeys("Swathy@1234");	 
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/button[1]")).click();
	}
	
	@Test
	public void search()
	{
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Herbal agro Growth Booster");
		driver.findElement(By.xpath("//*[@id=\"search\"]/span/button/i")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)", "");

		WebElement wishl=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]"));
		Actions act1=new Actions(driver);
		act1.moveToElement(wishl);
		act1.perform();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/div[2]/div[2]/ul/li[1]/button/span")).click();
	
		driver.findElement(By.xpath("//*[@id=\"column-left\"]/div[1]/div[2]/ul/li[4]/a")).click();
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,300)", "");
		
		WebElement image=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img"));
		Actions act2=new Actions(driver);
		act2.moveToElement(image);
		act2.perform();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/div[2]/div[2]/ul/li[1]/button/span")).click();
	
		WebElement all=driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a"));
		all.click();
		WebElement health=driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a"));
		health.click();
		WebElement safety=driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a"));
		safety.click();
	}
	
	@Test
	public void about()
	{
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		
		driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[2]/div/ul/li[2]/a")).click();
	}
	@Test
	public void screenshot() throws Exception
	{
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		WebElement Privcy=driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[4]/div/ul/li[1]/a"));
		File Privcyss=Privcy.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(Privcyss,new File("./swathy_srnsht//privacyimage1.png"));
	}
	@Test
	public void responcecode() throws Exception
	{
		
		URL ob=new URL(baseurl);
		URLConnection open=ob.openConnection();
		HttpURLConnection con=(HttpURLConnection)open;
		int responcecd=con.getResponseCode();
        System.out.println(responcecd);
		
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");

		}
	}
	
}
