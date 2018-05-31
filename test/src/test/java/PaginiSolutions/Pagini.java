package PaginiSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PachetLOGSStatus.CookieMessages;
import testN1.App;

public class Pagini {
	
	public WebDriver paginiNavigare(WebDriver driver) {
		CookieMessages cok = new CookieMessages();
	    cok.cookie(driver);
		 driver.findElement(By.xpath("//div[@class='display-table-cell vtop']/a[1]")).click();
		 cok.cookie(driver);
		    driver.findElement(By.xpath("//a[@href='/en/Contact'][contains(text(),'Phone')]")).click();
		    cok.cookie(driver);
		    System.out.println(driver.getTitle());
		    String contactPage = driver.getCurrentUrl();
		    
		    driver.findElement(By.xpath("//a[@href='#!'][contains(text(),'Share on social media')]")).click();
		    cok.cookie(driver);
		    driver.navigate().back();

		    int x=1;
		    while(x<5) {
		    	driver.findElement(By.xpath("//ul[@class='pagination-list']/li["+x+"]/a")).click();
		    x+=1;
		    }
		    x=1;
		    
		    
			CompletarePagini complet = new CompletarePagini();
			PreluareLinkBottom preluare = new PreluareLinkBottom();
			
		driver.findElement(By.linkText("Digital Evolution")).click();
		complet.completareDate(driver);
		preluare.preluareLinkuriBottom(driver);
	    driver.navigate().back();
	    
	    driver.findElement(By.linkText("Agile Transformation")).click();
	    complet.completareDate(driver);
	    preluare.preluareLinkuriBottom(driver);
	    driver.navigate().back();
	    
	    driver.findElement(By.linkText("Automation")).click();
	    complet.completareDate(driver);
	    preluare.preluareLinkuriBottom(driver);
	    driver.navigate().back();
	    
		return driver;
	}

}
