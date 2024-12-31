package Selenium123;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_content {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.getPageSource();
		String Actualresult=driver.getPageSource();
		System.out.println(Actualresult);
		if(Actualresult.contains("Gmail"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");

		}
	}

}
