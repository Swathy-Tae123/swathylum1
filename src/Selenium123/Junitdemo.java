package Selenium123;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

public class Junitdemo {
	
	@Before
	public void Openbrowser()
	{
		System.out.println("open the browser");
	}
	
	@Test
	public void test()
	{
		System.out.println("Test all the activities");
	}
	
	@After
	public void closebrowser()
	{
	System.out.println("Close the browser");
	}
}

