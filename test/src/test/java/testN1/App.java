package testN1;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import PaginiSolutions.Pagini;

public class App 
{
	WebDriver  driver=null;
	
	@BeforeTest
	public void deschidePagini() {
		System.setProperty("webdriver.chrome.driver","chromedriver");
		System.out.println("am trecut de driver");
//		ChromeOptions chromeOptions= new ChromeOptions();
//		chromeOptions.setBinary("/Users/Shared/Jenkins/Home/workspace/Chrome");
		
		driver = new ChromeDriver(); 
	    driver.manage().window().maximize();
	    driver.get("http://www.endava.com/en");
	}
	
	@Test
	public void testare1() throws InterruptedException {    
	    driver.findElement(By.xpath("//div[@class='display-table-cell vtop']/a[1]")).click();
	    driver.findElement(By.xpath("//a[@href='/en/Contact'][contains(text(),'Phone')]")).click();
	    System.out.println(driver.getTitle());
	    String contactPage = driver.getCurrentUrl();
	    
	    driver.findElement(By.xpath("//a[@href='#!'][contains(text(),'Share on social media')]")).click();
	    driver.navigate().back();

	    int x=1;
	    while(x<5) {
	    	driver.findElement(By.xpath("//ul[@class='pagination-list']/li["+x+"]/a")).click();
	    x+=1;
	    }
	    x=1;
	    
	    Pagini pag = new Pagini();
	    pag.paginiNavigare(driver);
	    
	    System.out.println("a intrat");
	    Thread.sleep(10000);
	    driver.close();
	}
}
