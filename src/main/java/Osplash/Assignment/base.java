package Osplash.Assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class base {
	
	public WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException
	{
		
		prop= new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\mande\\Documents\\eclipse\\osplash\\Assignment\\src\\main\\java\\Resources\\data.properties");
		prop.load(fis);
		String browsername= prop.getProperty("browser");
		System.out.println(browsername);
		
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mande\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions ();
			options.addExtensions (new File("C:\\Users\\mande\\OneDrive\\Documents\\Qlearly - Tab and Bookmark Manager.crx"));
			DesiredCapabilities capabilities = new DesiredCapabilities ();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			driver = new ChromeDriver(capabilities);
			
	        driver.navigate().refresh();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
		}
		else if(browsername.equals("firefox"))
		{
			//firefox
		}
		else if(browsername.equals("IE"))
		{
			//Internet explorer
		}
		//return driver;
		return driver;
		
        
	}
	

}
