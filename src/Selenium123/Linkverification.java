package Selenium123;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkverification {
	
	ChromeDriver driver;
	String Baseurl="https://www.google.com/";
	
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get(Baseurl);
	}
	
	@Test
	public void Test1() throws Exception
	{
		URL ob =new URL(Baseurl);
		URLConnection open=ob.openConnection();
		HttpURLConnection con=(HttpURLConnection)open;
		//HttpURLConnection con=(HttpURLConnection)ob.openConnection();
		int responsecode=con.getResponseCode();
		System.out.println(responsecode);
		
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");

		}
		
		List<WebElement> li = driver.findElements(By.tagName("a"));
		System.out.println(li.size());
		
		for(WebElement s:li)
		{
			String link=s.getAttribute("href");
			String text=s.getText();
			
			verify(link);
		
	}
	

}

	private void verify(String link) throws Exception {
		
		URL ob =new URL(Baseurl);
		HttpURLConnection con=(HttpURLConnection)ob.openConnection();
		int responsecode=con.getResponseCode();
		System.out.println(link);
		System.out.println(responsecode);
		
	
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
