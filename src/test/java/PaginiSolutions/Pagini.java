package PaginiSolutions;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PachetLOGSStatus.CookieMessages;
import testN1.App;

public class Pagini {
	
	public WebDriver paginiNavigare(WebDriver driver) throws InterruptedException {
//		CookieMessages cok = new CookieMessages();
//	    cok.cookie(driver);
//	    driver.getTitle();
	    
	    List<String> listaElem = new LinkedList<String>();
	    int lg = driver.findElements(By.xpath("//div[@id='rt-top']/div[1]/div/div/div/a")).size();
	    System.out.println("LUNGIMEA : "+lg);
	    
	    for(int i=1;i <= lg ; i++) {
	    	listaElem.add(driver.findElement(By.xpath("//div[@id='rt-top']/div[1]/div["+i+"]/div[1]/div[1]/a")).getAttribute("href"));
//	    	System.out.println(listaElem.get(i));
	    }
//	    for (String string : listaElem) {
//	    	driver.navigate().to(string);
//		
//	    }
	    driver.navigate().to("https://www.vauban.ro/en/");
	    
//	    for(int i=1;i <= lg -1; i++) {
//	    	driver.findElement(By.xpath("//div[@id='rt-top']/div[1]/div["+i+"]/div[1]/div[1]/a")).click();
//	    	System.out.println(driver.getTitle());
//	    	driver.navigate().to("https://www.vauban.ro/en/");
//	    	System.out.println(driver.getTitle());
//
//	    }
	    
	  meniuTOP meniu = new meniuTOP();
	  meniu.meniul1(driver);
	  driver.navigate().to("https://www.vauban.ro/en/");
	  meniu.meniul2(driver);
	  driver.navigate().to("https://www.vauban.ro/en/");
	  meniu.meniul3(driver);
	  driver.navigate().to("https://www.vauban.ro/en/");
	  meniu.meniul4(driver);
		return driver;
	}

}
