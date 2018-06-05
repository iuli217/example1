package PaginiSolutions;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import CompletareMeetings.CompletareDate;

public class meniuTOP {
	
	
	//Professional Services
	public WebDriver meniul1(WebDriver driver) {
		Actions action = new Actions(driver);
		WebElement we;
		CompletareDate complDate = new CompletareDate();
		
		
		
		List<String> listaElem = new LinkedList<String>();
		int lg = driver.findElements(By.xpath("//li[@class='item126 parent']/div/div/ul/li")).size();
	    
	    for(int i=1 ; i<=lg;i++) {
	    	listaElem.add(driver.findElement(By.xpath("//li[@class='item126 parent']/div/div/ul/li["+i+"]/a")).getAttribute("href"));
	    }
	    System.out.println("LUNGIME : "+lg);
	    for(int i=1; i <=lg;i++) {
	    	
	    	we= driver.findElement(By.xpath("//a[contains(text(),'Professional Services')]"));
	    	action.moveToElement(we).build().perform();	    	
////	    	System.out.println(driver.findElement(By.xpath("//li[@class='item126 parent']/div/div/ul/li["+i+"]/a")).isDisplayed());
////	    	System.out.println(driver.findElement(By.xpath("//li[@class='item126 parent']/div/div/ul/li["+i+"]/a")).isEnabled());
	    	driver.findElement(By.xpath("//li[@class='item126 parent']/div/div/ul/li["+i+"]/a")).click();
	    	if(driver.getTitle().equals("Home")) {System.out.println("Eroare meniu 1 la i="+i);  }  	
	    	complDate.completare(driver);    	
	    	driver.navigate().to("https://www.vauban.ro/en/");
	    }
	    
		 for (String string : listaElem) {
			 driver.navigate().to(string);
			 if(driver.getTitle().equals("Home")) {System.out.println("Eroare meniu 1 la listaElem");  }  
			 System.out.println(driver.getTitle());
		}
		
		return driver;	
	    }
	
	

	
//	Business Applications
	public WebDriver meniul2(WebDriver driver) {
//		relatedInfo relInfo = new relatedInfo();
		Actions action = new Actions(driver);
		WebElement we;
		WebElement we1;
		Boolean bol=false;
		List<String> listaElem = new LinkedList<String>();
		CompletareDate complDate = new CompletareDate();
		
		int lg = driver.findElements(By.xpath("//li[@class='item127 parent']/div/div/ul/li")).size();
	    
	    for(int i=1 ; i<=lg;i++) {
	    	listaElem.add(driver.findElement(By.xpath("//li[@class='item127 parent']/div/div/ul/li["+i+"]/a")).getAttribute("href"));
	    }
	    System.out.println("LUNGIME : "+lg);
	    	    
	    for(int i=1; i <=lg;i++) {
    		
	    	bol = driver.findElements( By.xpath("//li[@class='item127 parent']/div/div/ul/li["+i+"]/div") ).size() != 0;
	    	if(bol) {
	    		int lungimeSec = driver.findElements(By.xpath("//li[@class='item127 parent']/div/div/ul/li["+i+"]/div/div/ul/li/div/div/div/p")).size();
	    		for(int j = 1; j<=lungimeSec; j++) {

	    	
	    			we= driver.findElement(By.xpath("//a[contains(text(),'Business Applications')]"));
	    	    	action.moveToElement(we).build().perform();	
	    			
	    			we1= driver.findElement(By.xpath("//li[@class='item127 parent']/div/div/ul/li["+i+"]/a"));
	    			action.moveToElement(we1).build().perform();	  
	    			System.out.println(j+"jjjjjjjjj");
	    			try {
	    				
	    			driver.findElement(By.xpath("//li[@class='item127 parent']/div/div/ul/li["+i+"]/div/div/ul/li/div/div/div/p["+j+"]/a")).click();
	    			if(driver.getTitle().equals("Home")) {System.out.println("Eroare meniu 2 la i="+i);  
	    			}else {
	    			}
	    			driver.navigate().to("https://www.vauban.ro/en/");
	    			}catch(Exception e) {System.out.println("suntem pe catch");}
	    			}
	    		System.out.println("suntem pe trueeee"+lg);
	    		}else {
	    			
	    			we= driver.findElement(By.xpath("//a[contains(text(),'Business Applications')]"));
	    	    	action.moveToElement(we).build().perform();	    	
	    	    	driver.findElement(By.xpath("//li[@class='item127 parent']/div/div/ul/li["+i+"]/a")).click();
	    	    	if(driver.getTitle().equals("Home")) {System.out.println("Eroare meniu 2 la i="+i);  
	    	    	}else {

	    	    	}  
	    	    	driver.navigate().to("https://www.vauban.ro/en/");
	    			
	    		}
	    	
	    }
	       
		 for (String string : listaElem) {
			 try {
			 driver.navigate().to(string);
			 if(driver.getTitle().equals("Home")) {System.out.println("Eroare meniu 2 la listaElem");  }  
			 System.out.println(driver.getTitle());
			 }catch(Exception lista) {System.out.println(string+" eroare pe string");}
		}	
		return driver;			
	}

	//Industries & Customers
	public WebDriver meniul3(WebDriver driver) throws InterruptedException {
		relatedInfo relInfo = new relatedInfo();
		Actions action = new Actions(driver);
		WebElement we;
		WebElement we1;
		Boolean bol=false;
		List<String> listaElem = new LinkedList<String>();
		
		int lg = driver.findElements(By.xpath("//li[@class='item128 parent']/div/div/ul/li")).size();
			
	    for(int i=1 ; i<=lg;i++) {    		
	    		listaElem.add(driver.findElement(By.xpath("//li[@class='item128 parent']/div/div/ul/li["+i+"]/a")).getAttribute("href"));  	
	    }
	    
	    for(int i=1; i <=lg;i++) {
	    	    		
	    	bol = driver.findElements( By.xpath("//li[@class='item128 parent']/div/div/ul/li["+i+"]/div") ).size() != 0;
	    	if(bol) {
	    		int lungimeSec = driver.findElements(By.xpath("//li[@class='item128 parent']/div/div/ul/li["+i+"]/div/div/ul/li/div/div/div/p")).size();
	    		for(int j = 1; j<=lungimeSec; j++) {

	    			we= driver.findElement(By.xpath("//a[contains(text(),'Industries & Customers')]"));
	    	    	action.moveToElement(we).build().perform();	
	    			
	    			we1= driver.findElement(By.xpath("//li[@class='item128 parent']/div/div/ul/li["+i+"]/a"));
	    			action.moveToElement(we1).build().perform();	  
	    			System.out.println(j+"jjjjjjjjj");
	    			try {
	    				
	    			driver.findElement(By.xpath("//li[@class='item128 parent']/div/div/ul/li["+i+"]/div/div/ul/li/div/div/div/p["+j+"]/a")).click();
	    			if(driver.getTitle().equals("Home")) {System.out.println("Eroare meniu 3 la i="+i);  
	    			}
	    			
	    			driver.navigate().to("https://www.vauban.ro/en/");
	    			}catch(Exception e) {System.out.println("suntem pe catch");}
	    			}
	    		}else {
	    			we= driver.findElement(By.xpath("//a[contains(text(),'Industries & Customers')]"));
	    	    	action.moveToElement(we).build().perform();	    			
	    	    	driver.findElement(By.xpath("//li[@class='item128 parent']/div/div/ul/li["+i+"]/a")).click();
	    	    	if(driver.getTitle().equals("Home")) {System.out.println("Eroare meniu 3 la i="+i);  
	    	    	}
	    	    	driver.navigate().to("https://www.vauban.ro/en/");
	    		}
	    	
	    }
		 for (String string : listaElem) {
			 driver.navigate().to(string);
			 System.out.println(driver.getTitle());
			 if(driver.getTitle().equals("Home")) {System.out.println("Eroare meniu 3 la listaElem");  }  
		}
		return driver;		
	}

	
	//Careers
	public WebDriver meniul4(WebDriver driver) {
		Careers car = new Careers();
		driver.findElement(By.xpath("//a[contains(text(),'Careers')]")).click();
    	if(driver.getTitle().equals("Home")) {System.out.println("Eroare meniu 4");
    	}else {
    		car.cariere(driver);
    	}

		driver.navigate().to("https://www.vauban.ro/en/");
		return driver;
			
	}
}
