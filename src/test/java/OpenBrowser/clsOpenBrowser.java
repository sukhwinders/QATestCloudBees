package OpenBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class clsOpenBrowser {
	
	WebDriver dri;
	
	public clsOpenBrowser(WebDriver driver)
	{
		//System.setProperty("webdriver.chrome.driver","/Users/sukhwinders/Desktop/For Jenkins/chromedriver");
		ChromeDriverManager.getInstance().setup();
		dri=new ChromeDriver();
		//this.dri=driver;
		//dri=new FirefoxDriver();
		dri.get("https://login.salesforce.com");	
	}
	
	public static String getDriverDirectory() {
        String DriverDir = System.getProperty("user.dir") + "/chromedriver";
//        if (projectDir.contains("/AutomationSalesforce/"))
//        {
//            projectDir = projectDir + "src/test/java/Config/";
//        }
        System.out.println("Using base directory as: " + DriverDir);
     return DriverDir; 
     }
	
}
