package PaginiSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Pagini {
	
	public WebDriver paginiNavigare(WebDriver driver) throws InterruptedException {
		Completare comp = new Completare();
		
		driver.findElement(By.linkText("Digital Evolution")).click();
		Thread.sleep(1000);
		comp.completareDate(driver);
	    driver.navigate().back();
	    driver.findElement(By.linkText("Agile Transformation")).click();
	    Thread.sleep(1000);
	    comp.completareDate(driver);
	    driver.navigate().back();
	    try{
	    	driver.findElement(By.xpath("(//a[contains(text(),'Automation')])[2]")).click();
	    }catch(Exception me) {
	    	driver.navigate().to("http://www.endava.com/en");
	    	Thread.sleep(1000);
	    	driver.findElement(By.xpath("//a[@href='/en/Automation'][@class='box-link']")).click();
	    }
	    Thread.sleep(1000);
	    comp.completareDate(driver);
	    driver.navigate().back();

		return driver;
	}

}
