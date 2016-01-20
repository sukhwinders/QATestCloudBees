package ExecuteChrome;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


import OpenBrowser.clsOpenBrowser;

public class clsExecuteChrome {
	
	WebDriver driver;
	

	@Test
	public void ChromeOpen()
	{
		clsOpenBrowser qa=new clsOpenBrowser(driver);
		//System.out.println("FireFox opened");
		System.out.println("Chrome browser opened");
		
	}
	
}
