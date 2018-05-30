package PaginiSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import testN1.App;

public class Pagini {
	
	public WebDriver paginiNavigare(WebDriver driver) {
		driver.findElement(By.linkText("Digital Evolution")).click();
	    driver.navigate().back();
	    driver.findElement(By.linkText("Agile Transformation")).click();
	    driver.navigate().back();
	    driver.findElement(By.linkText("Automation")).click();
	    driver.navigate().back();
		return driver;
	}

}
