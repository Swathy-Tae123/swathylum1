package Selenium123;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demoproject {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		String Actualresult=driver.getTitle();
		System.out.println(Actualresult);
		String Expectedresult="Google";
		
		if(Actualresult.equals(Expectedresult))
		{
			System.out.println("Pass");

		}
		else
		{
			System.out.println("Fail");

		}
	}

}
