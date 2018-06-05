package PachetLOGSStatus;

import java.util.Date;
import java.util.Set;
import java.util.logging.Level;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CookieMessages {
	
	WebDriver driver;
	public void cookie(WebDriver driver) {
		DesiredCapabilities capab = DesiredCapabilities.chrome();
		LoggingPreferences logpref = new LoggingPreferences();
		logpref.enable(LogType.BROWSER, Level.ALL);
		capab.setCapability(CapabilityType.LOGGING_PREFS, logpref);
		
		
		LogEntries logs = driver.manage().logs().get(LogType.BROWSER);
		Set<org.openqa.selenium.Cookie> cook =  driver.manage().getCookies();
		for (org.openqa.selenium.Cookie cookie : cook) {
			System.out.println("Cookie :   "+cookie);
		}
		
		for (LogEntry logEntry : logs) {
			System.out.println(new Date(logEntry.getTimestamp())+"   "+logEntry.getLevel()+"  "+logEntry.getMessage() +"  ") ;
			
		}
		
	}
}
