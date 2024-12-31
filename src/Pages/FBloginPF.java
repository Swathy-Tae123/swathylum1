package Pages;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBloginPF {
	
	WebDriver driver;
	@FindBy(id="email") WebElement fbemail;
	@FindBy(name="pass") WebElement password;
	@FindBy(xpath="//*[@id=\"u_0_5_XJ\"]") WebElement login;
	
	public FBloginPF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void setvalues(String email,String Password)
	{
		fbemail.sendKeys("swathy@gmail.com");
		password.sendKeys("abcd");
	}
	
	public void login()
	{
		login.click();
	}

}
