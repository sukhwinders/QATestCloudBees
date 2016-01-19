package ExecuteChrome;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import OpenBrowser.clsOpenBrowser;

public class clsExecuteChrome {
	

	@Test
	public void ChromeOpen()
	{
		clsOpenBrowser qa=new clsOpenBrowser();
		System.out.println("Chrome opened");
		
	}
	
}
