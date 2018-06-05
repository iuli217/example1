package PachetLOGSStatus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

public class Drivere {

	public WebDriver chrome(WebDriver driver, DesiredCapabilities capabilities) {
		driver = new ChromeDriver(capabilities);
		return driver;
	}
	
	public WebDriver safari(WebDriver driver, DesiredCapabilities capabilities) {
		driver = new SafariDriver(capabilities);
		return driver;
	}
	
	
}
