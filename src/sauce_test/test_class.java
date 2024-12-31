package sauce_test;

import org.testng.annotations.Test;

import Pages1.FBpage;
import Utility.Excelutil;
import sauce_base.base_class;
import sauce_page.page_class;

public class test_class extends base_class{
	
	
	@Test
	public void verifyLogin () throws Exception
	{
		page_class p1=new page_class(driver);
		String x1="D:\\sauceBook1.xlsx";
		String Sheet="Sheet1";
		int rowcount=Excelutil.getRowCount(x1,Sheet);
		
		for(int i=1;i<=rowcount;i++)
		{
			String Username=Excelutil.getCellValue(x1,Sheet,i,0);
			System.out.println("username :"+Username);
			String Password=Excelutil.getCellValue(x1,Sheet,i,1);
			System.out.println("password :"+Password);
			
			p1.Setvalues(Username, Password);
			p1.login();
			p1.loginvalidation();
			
		}
	}
	

}
