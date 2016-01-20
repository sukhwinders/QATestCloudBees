package OpenBrowser;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


//import io.github.bonigarcia.wdm.ChromeDriverManager;

public class clsOpenBrowser {
	
	WebDriver dri;
	
	public clsOpenBrowser(WebDriver driver) throws MalformedURLException
	{
		//System.setProperty("webdriver.chrome.driver","/Users/sukhwinders/Desktop/For Jenkins/chromedriver");
		
		//ChromeDriverManager.getInstance().setup();
		//dri=new ChromeDriver();
		
		//this.dri=driver;
		dri=new FirefoxDriver();
		
		//FirefoxBinary firefox = new FirefoxBinary();
		//firefox.setEnvironmentProperty("DISPLAY", ":20");
		//dri = new FirefoxDriver(firefox, null);
		
		//DesiredCapabilities capability = DesiredCapabilities.chrome();
		//WebDriver dri = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
		//capability.setJavascriptEnabled(true);
		
		
		dri.get("https://login.salesforce.com");	
	}
	
	public void BrowserClose()
	{
		dri.quit();
	}
	
	
}
