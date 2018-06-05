package PachetLOGSStatus;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import PaginiSolutions.Pagini;
import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.proxy.CaptureType;

public class HARul {
	BrowserMobProxy server;
	WebDriver driver;
	public WebDriver harul(int cas) throws InterruptedException {
		Drivere drv = new Drivere();
		
		
		server = new BrowserMobProxyServer();	   
        server.start(0);
	    int port = server.getPort();
	    Proxy proxy = ClientUtil.createSeleniumProxy(server);

	    DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability(CapabilityType.PROXY, proxy);
	    
	    switch(cas) {
	    case 1:
	    	System.out.println("caz 1");
//	    	drv.chrome(driver, capabilities);
	    	driver = new ChromeDriver(capabilities);
	    server.enableHarCaptureTypes(CaptureType.REQUEST_CONTENT, CaptureType.RESPONSE_CONTENT);
	    server.newHar("VAUBANChrome.com");
	    break;
	    
	    case 2:
	    	System.out.println("caz 2");
//	    	drv.safari(driver, capabilities);
	    	DesiredCapabilities capabilities1 = DesiredCapabilities.firefox();
	    	System.setProperty("webdriver.gecko.driver", "geckodriver");
	    	driver = new FirefoxDriver(capabilities1);
	    server.enableHarCaptureTypes(CaptureType.REQUEST_CONTENT, CaptureType.RESPONSE_CONTENT);
	    server.newHar("VAUBANFireFox.com");
	    break;
	    
	    default:
	    	System.out.println("caz def");
	    	driver = new ChromeDriver(capabilities);
		    server.enableHarCaptureTypes(CaptureType.REQUEST_CONTENT, CaptureType.RESPONSE_CONTENT);
		    server.newHar("VAUBANChrome.com");
		    break;
	    }

	    driver.get("https://www.vauban.ro/en/");
	    Pagini pag = new Pagini();
	    pag.paginiNavigare(driver);
	    String sFileName=null;
	    
	    Har har = server.getHar();
	    switch(cas) {
	    case 1:
	    	CookieMessages cook = new CookieMessages();
	    	cook.cookie(driver);
	    	sFileName = "ChromeVauban.har";
	    	break;
	    case 2:
	    	sFileName = "FirefoxVauban.har";
		    break;
		 default:
			 sFileName = "ChromeVauban.har";
			 break;
	    }
	    

	    File harFile = new File(sFileName);
		try {
			har.writeTo(harFile);
		} catch (IOException ex) {
			 System.out.println (ex.toString());
		     System.out.println("Could not find file " + sFileName);
		}
	    
	    
		System.out.println(har.getLog());
		driver.close();
	    driver.quit();
		
		
		return driver;
		
	}
	
}
