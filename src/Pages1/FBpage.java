package Pages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FBpage {
	
	WebDriver driver;
	By fbemail=By.id("email");
	By fbpassword=By.xpath("//*[@id=\"pass\"]");
	By Login=By.name("login");
	
	public FBpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void Setvalues(String email,String password)
	{
		driver.findElement(fbemail).clear();
		driver.findElement(fbemail).sendKeys(email);
		driver.findElement(fbpassword).clear();
		driver.findElement(fbpassword).sendKeys(password);
	}
	
	public void login()
	{
		driver.findElement(Login).click();
	}

}
