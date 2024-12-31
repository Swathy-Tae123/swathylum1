package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGdemo {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void Open()
	{
		System.out.println("Open browser");// new ChromeDriver
	}
	
	@BeforeMethod
	public void OpenURL()
	{
		System.out.println("Open URL");
	}
	
	@Test(priority=1,enabled=false)//skip Test1
	public void Test1()
	{
		System.out.println("Test_1");
	}
	@Test(priority=2,invocationCount=3)//execute Test2 3 times
	public void Test2()
	{
		System.out.println("Test_2");
	}
	@Test(priority=3,dependsOnMethods="Test2")//Test3 will execute after Test2
	public void Test3()
	{
		System.out.println("Test_3");
	}
	
	@AfterMethod
	public void TestMethod()
	{
		System.out.println("execute after each test ");
	}
	@AfterTest
	public void closebrowser()
	{
		System.out.println("Execute after all test,and close browser");
	}



}
