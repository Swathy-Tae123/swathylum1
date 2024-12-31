package Rishi_pages;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.openqa.selenium.WebDriver;

public class responcecode {
	
	WebDriver driver;
	
	String baseurl="https://rishiherbalindia.linker.store/";
	
	public responcecode(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void respnscd() throws Exception
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
