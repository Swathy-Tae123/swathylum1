package Workout;

	import java.net.HttpURLConnection;
	import java.net.MalformedURLException;
	import java.net.URL;
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
			HttpURLConnection con=(HttpURLConnection)ob.openConnection();
			System.out.println(con);
			int responsecode=con.getResponseCode();
			System.out.println(responsecode);
			
			con.connect();
			if(responsecode==200)
			{
				System.out.println("Valid"+"\n");
			}
			else
			{
				System.out.println("Invalid"+"\n");

			}
			
			List<WebElement> li = driver.findElements(By.tagName("a"));
			System.out.println("Total size :"+li.size()+"\n");
			
			for(WebElement s:li)
			{
				String link=s.getAttribute("href");
				String text=s.getText();
				System.out.println(link+"...."+text);
				
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
	}
			
