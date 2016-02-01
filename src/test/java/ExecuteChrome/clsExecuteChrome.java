package ExecuteChrome;

import org.testng.annotations.Test;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


import OpenBrowser.clsOpenBrowser;

public class clsExecuteChrome {
	
	WebDriver driver;
	

	@Test
	public void BrowserOpen() throws MalformedURLException
	{
		System.out.println("Browser has to be opened");
		clsOpenBrowser bsr=new clsOpenBrowser(driver);
		//System.out.println("FireFox opened");
		System.out.println("Browser has been opened");
		bsr.BrowserClose();
		System.out.println("Browser has been closed");
		
	}
	
}
