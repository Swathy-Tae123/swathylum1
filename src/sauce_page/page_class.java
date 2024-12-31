package sauce_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class page_class {
	
	WebDriver driver;
	By sauceun=By.xpath("//*[@id=\"user-name\"]");
	By saucepassword=By.xpath("//*[@id=\"password\"]");
	By sauceLogin=By.xpath("//*[@id=\"login-button\"]");
	
	public page_class(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void Setvalues(String username,String password)
	{
		driver.findElement(sauceun).clear();
		driver.findElement(sauceun).sendKeys(username);
		driver.findElement(saucepassword).clear();
		driver.findElement(saucepassword).sendKeys(password);
	}
	
	public void login()
	{
		driver.findElement(sauceLogin).click();
	}
	
	public void loginvalidation()
	{
		String actual=driver.getCurrentUrl();
		System.out.println(actual);
		String expected="https://www.saucedemo.com/v1/";
		
		if(actual.equals(expected))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
