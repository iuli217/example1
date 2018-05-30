package PrimaPagina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InchidereSiClickuri {

	public WebDriver primaPagina(WebDriver driver) {
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
		
		    Offices oficii = new Offices();
		    oficii.ofices(driver);
		    
		return driver;
		
	}
	
}
