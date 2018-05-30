package testN1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import PaginiSolutions.Pagini;
import PrimaPagina.InchidereSiClickuri;

public class App 
{
	WebDriver  driver=null;
	WebDriver  driver1=null;
	
	@BeforeTest
	public void deschidePagini() {

		System.out.println("am trecut de before");


	}
	
	@Test
	public void testare1() throws InterruptedException {    
		driver = new ChromeDriver(); 
	    driver.manage().window().maximize();
	    driver.get("http://www.endava.com/en");
	    
//		InchidereSiClickuri prim = new InchidereSiClickuri();
//		prim.primaPagina(driver);
	    
	    Pagini pag = new Pagini();
	    pag.paginiNavigare(driver);
	    
	    System.out.println("a intrat");

	}
	
	
	@Test
	public void test2() throws InterruptedException {
		FirefoxOptions chromeOptions= new FirefoxOptions();
		chromeOptions.setBinary("test\\firefox\\firefox.exe");
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver1 = new FirefoxDriver(); 
	    driver1.manage().window().maximize();
	    driver1.get("http://www.endava.com/en");
	    
//	    InchidereSiClickuri prim = new InchidereSiClickuri();
//		prim.primaPagina(driver1);
	    
	    Pagini pag = new Pagini();
	    pag.paginiNavigare(driver1);
	    
	    
		
	}
	
	@AfterTest
	public void inchidere() throws InterruptedException {
		Thread.sleep(5000);
	    driver.close();
	    driver1.close();
	    System.out.println("suntem in aftertTest");
	}
}
