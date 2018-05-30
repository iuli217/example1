package PrimaPagina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Offices {
	
	public WebDriver ofices(WebDriver driver) {
		int x = driver.findElements(By.xpath("//div[@class='owl-wrapper']/div")).size();
		
		for(int i=1;i <= x;i++) {
			String link = driver.findElement(By.xpath("//div[@class='owl-wrapper']/div["+i+"]/div/a")).getAttribute("href");
			driver.navigate().to(link);
			driver.navigate().back();
		}

		return driver;
	}

}
