package testN1;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import PachetLOGSStatus.HARul;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import PaginiSolutions.Pagini;
import io.netty.handler.codec.http.Cookie;
import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.proxy.CaptureType;

public class App 
{
	
	BrowserMobProxy server;
	
	
	@BeforeTest
	public void deschidePagini() {
//		System.setProperty("webdriver.chrome.driver","chromedriver");
		System.out.println("am trecut de driver");
//		ChromeOptions chromeOptions= new ChromeOptions();
//		chromeOptions.setBinary("/Users/Shared/Jenkins/Home/workspace/Chrome");
		
//		driver = new ChromeDriver(); 
//	    driver.manage().window().maximize();
//	    driver.get("http://www.endava.com/en");
	}
	
	@Test
	public void testare1() throws InterruptedException, IOException {  
		
		HARul harul = new HARul();
		harul.harul();
	    System.out.println("a intrat");
	    
	}
	
	@AfterTest
	public void dupaTest() throws InterruptedException {
//		WebDriver driv = new ChromeDriver();
//		driv.get("http://www.softwareishard.com/har/viewer/");
		
	}
	
}
