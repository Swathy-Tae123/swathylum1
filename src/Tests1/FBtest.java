package Tests1;

import org.testng.annotations.Test;

import Basepkg.Baseclass;
import Pages1.FBpage;
import Utility.Excelutil;

public class FBtest extends Baseclass{

	@Test
	public void verifyLoginWithValidCred () throws Exception
	{
		FBpage p1=new FBpage(driver);
		String x1="D:\\Book1.xlsx";
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
			
		}
	}

}
