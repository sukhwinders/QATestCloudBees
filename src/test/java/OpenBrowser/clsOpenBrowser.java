package OpenBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class clsOpenBrowser {
	
	WebDriver dri;
	
	public clsOpenBrowser()
	{
		//System.setProperty("webdriver.chrome.driver","/Users/sukhwinders/Desktop/For Jenkins/chromedriver");
		//dri=new ChromeDriver();
		dri=new FirefoxDriver();
		dri.get("https://login.salesforce.com");	
	}
}
