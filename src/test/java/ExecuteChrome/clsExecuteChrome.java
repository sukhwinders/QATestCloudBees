package ExecuteChrome;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


import OpenBrowser.clsOpenBrowser;

public class clsExecuteChrome {
	
	WebDriver driver;
	

	@Test
	public void ChromeOpen() throws MalformedURLException
	{
		System.out.println("Browser has to be opened");
		clsOpenBrowser qa=new clsOpenBrowser(driver);
		//System.out.println("FireFox opened");
		System.out.println("Browser opened");
		
	}
	
}
