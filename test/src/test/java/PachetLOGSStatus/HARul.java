package PachetLOGSStatus;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import PaginiSolutions.Pagini;
import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.proxy.CaptureType;

public class HARul {
	BrowserMobProxy server;
	WebDriver driver;
	public WebDriver harul() {
		
		server = new BrowserMobProxyServer();	   
        server.start(0);
	    int port = server.getPort();
	    Proxy proxy = ClientUtil.createSeleniumProxy(server);

	    DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability(CapabilityType.PROXY, proxy);
	    driver = new ChromeDriver(capabilities);

	    server.enableHarCaptureTypes(CaptureType.REQUEST_CONTENT, CaptureType.RESPONSE_CONTENT);
	    server.newHar("ENDAVA.com");

	    // open yahoo.com
	    driver.get("http://www.endava.com/en");
	    Pagini pag = new Pagini();
	    pag.paginiNavigare(driver);
	    
	    CookieMessages cok = new CookieMessages();
	    cok.cookie(driver);
	    
	    Har har = server.getHar();
	    String sFileName = "/Users/dumitrufloriniulia/eclipse-workspace/test/EndavaEasy.har";
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
