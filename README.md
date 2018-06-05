Teste facute dar neintegrate (dar testate) :


RelatedInfo rel = new RelatedInfo();
	    int nr = driver.findElements(By.xpath("//li[@class='item127 parent']/div/div/ul/li")).size();
	    for(int i=1;i<=nr;i++) {
	    	Actions action = new Actions(driver);
	    	int cont = driver.findElements(By.xpath("//li[@class='item127 parent']/div/div/ul/li["+i+"]/div")).size();
	    	if(cont != 0) {    		
	    		int lg = driver.findElements(By.xpath("//li[@class='item127 parent']/div/div/ul/li["+i+"]/div/div/ul/li/div/div/div/p")).size();	
	    		for(int j = 1;j<=lg;j++ ) {
	    			
	    			WebElement we = driver.findElement(By.xpath("//a[@class='item'][contains(text(),'Business Applications')]"));
	    	    	action.moveToElement(we).build().perform();
	    			
	    	    	WebElement we1 = driver.findElement(By.xpath("//li[@class='item127 parent']/div/div/ul/li["+i+"]/a"));
	    	    	action.moveToElement(we1).build().perform();
	    	
	    	    	driver.findElement(By.xpath("//li[@class='item127 parent']/div/div/ul/li["+i+"]/div/div/ul/li/div/div/div/p["+j+"]/a")).click();
	    	    	if(driver.getCurrentUrl().equals("")) {
		    			System.out.println("Eroare la meniu 2 la i="+i+" si j = "+j +"");
		    		}else {
		    			rel.relatedinfo(driver); 
		    		} 	
	    	    	driver.navigate().to("https://www.vauban.ro/en");
	    		}
	    	}else {
	    		WebElement we = driver.findElement(By.xpath("//a[@class='item'][contains(text(),'Business Applications')]"));
		    	action.moveToElement(we).build().perform();
	    		
	    		driver.findElement(By.xpath("//li[@class='item127 parent']/div/div/ul/li["+i+"]/a")).click();
	    		if(driver.getCurrentUrl().equals("")) {
	    			System.out.println("Eroare la meniu 2 la i="+i +" //li[@class='item127 parent']/div/div/ul/li[\"+i+\"]/a");
	    		}else {
	    			rel.relatedinfo(driver); 
	    		}
	    		driver.navigate().to("https://www.vauban.ro/en");
	    	}
	    	
	    }
	    
	    
	    nr = driver.findElements(By.xpath("//li[@class='item128 parent']/div/div/ul/li")).size();
	    for(int i=1;i<=nr;i++) {
	    	Actions action = new Actions(driver);
	    	int cont = driver.findElements(By.xpath("//li[@class='item128 parent']/div/div/ul/li["+i+"]/div")).size();
	    	if(cont != 0) {    		
	    		int lg = driver.findElements(By.xpath("//li[@class='item128 parent']/div/div/ul/li["+i+"]/div/div/ul/li/div/div/div/p")).size();	
	    		for(int j = 1;j<=lg;j++ ) {
	    			
	    			WebElement we = driver.findElement(By.xpath("//a[@class='item'][contains(text(),'Industries & Customers')]"));
	    	    	action.moveToElement(we).build().perform();
	    			
	    	    	WebElement we1 = driver.findElement(By.xpath("//li[@class='item128 parent']/div/div/ul/li["+i+"]/a"));
	    	    	action.moveToElement(we1).build().perform();
	    	int cont1 = driver.findElements(By.xpath("//li[@class='item128 parent']/div/div/ul/li["+i+"]/div/div/ul/li/div/div/div/p["+j+"]/a")).size();
	    	if(cont1!=0) {
	    	    	driver.findElement(By.xpath("//li[@class='item128 parent']/div/div/ul/li["+i+"]/div/div/ul/li/div/div/div/p["+j+"]/a")).click();
	    	    	if(driver.getCurrentUrl().equals("wwww.vauban.ro")) {
		    			System.out.println("Eroare la meniu 2 la i="+i+" si j = "+j +"");
		    		}else {
		    			rel.industriesCustomers(driver);
		    		} 	
	    	    	driver.navigate().to("https://www.vauban.ro/en");}
	    		}
	    	}else {
	    		WebElement we = driver.findElement(By.xpath("//a[@class='item'][contains(text(),'Industries & Customers')]"));
		    	action.moveToElement(we).build().perform();
	    		
	    		driver.findElement(By.xpath("//li[@class='item128 parent']/div/div/ul/li["+i+"]/a")).click();
	    		if(driver.getCurrentUrl().equals("wwww.vauban.ro")) {
	    			System.out.println("Eroare la meniu 2 la i="+i +" //li[@class='item128 parent']/div/div/ul/li[\"+i+\"]/a");
	    		}else {
	    			rel.industriesCustomers(driver);
	    		}
	    		driver.navigate().to("https://www.vauban.ro/en");
	    	}
	    	
	    }
//////////
///////////
///////////
////////

package PrimaPagina;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RelatedInfo {
	
	public WebDriver relatedinfo(WebDriver driver) {
		erori(driver);
		String parentHandle = driver.getWindowHandle();
		String titlu = driver.getTitle(); 
		int dtsheet = driver.findElements(By.xpath("//div[contains(text(),'Datasheets:')]")).size();
		int casestud = driver.findElements(By.xpath("//div[contains(text(),'Case Studies:')]")).size();
		
		int lg=0;
		if(dtsheet !=0 & casestud !=0) {
		lg = driver.findElements(By.xpath("//div[@class='sidebarBorderRadius']/div[2]/div")).size();
		
		System.out.println(lg +titlu);
		erori(driver);
		for(int i=2;i<lg;i++) {
			driver.findElement(By.xpath("//div[@class='sidebarBorderRadius']/div[2]/div["+i+"]/a[1]")).click();			
			erori(driver);
			if(driver.getCurrentUrl().contains("mp4")) {
				driver.navigate().back();
			}else {
			driver.switchTo().window(parentHandle);	
			}
			if(!driver.getTitle().equals(titlu)) {
				System.out.println(lg +titlu +"   "+driver.getTitle()); 
			driver.navigate().back();}
			}
		erori(driver);
		}
			
		if(dtsheet !=0 & casestud !=0) {
			erori(driver);
		lg=driver.findElements(By.xpath("//div[@class='sidebarBorderRadius']/div[3]/div")).size();
		for(int i=2;i<=lg;i++) {
			erori(driver);
			driver.findElement(By.xpath("//div[@class='sidebarBorderRadius']/div[3]/div["+i+"]/a")).click();
			erori(driver);
			if(driver.getCurrentUrl().contains("mp4")) {
				driver.navigate().back();
			}else {
			driver.switchTo().window(parentHandle);	
			}
			if(!driver.getTitle().equals(titlu)) {
			driver.navigate().back();
			}
		}		
		Set<String> ara = driver.getWindowHandles();
		
		for (String string : ara) {
			driver.switchTo().window(string);
			erori(driver);
			if(!driver.getWindowHandle().equals(parentHandle)) {
			driver.close();}
			}
		driver.switchTo().window(parentHandle);
		erori(driver);
	
		}else if(dtsheet !=0 & casestud ==0) {
			erori(driver);
			lg=driver.findElements(By.xpath("//div[@class='sidebarBorderRadius']/div[2]/div")).size();
			for(int i=2;i<=lg;i++) {
				erori(driver);
			driver.findElement(By.xpath("//div[@class='sidebarBorderRadius']/div[2]/div["+i+"]/a")).click();
			erori(driver);
			if(driver.getCurrentUrl().contains("mp4") || driver.getCurrentUrl().contains("Video")) {
				driver.navigate().back();
			}else {
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			driver.switchTo().window(parentHandle);	
			}
			erori(driver);
				if(!driver.getTitle().equals(titlu)) {
				driver.navigate().back();}
			}
			
			Set<String> ara = driver.getWindowHandles();
			
			for (String string : ara) {
				driver.switchTo().window(string);
				erori(driver);
				if(!driver.getWindowHandle().equals(parentHandle)) {
				driver.close();}
				}
			driver.switchTo().window(parentHandle);
		}
		meniuJosLinks(driver);
		meniujosNews(driver);
		
		return driver;
		
	}
	
	
	
	public WebDriver meniuJosLinks(WebDriver driver) {
		erori(driver);
		String parentHandle = driver.getWindowHandle();
		String titlu = driver.getTitle(); 
		int links = driver.findElements(By.xpath("//h2[contains(text(),'Useful Links')]")).size();
		
		if(links != 0) {
			
			for(int i=1;i<=3;i++) {
				erori(driver);
			driver.findElement(By.xpath("//div[@class='rt-grid-3 rt-alpha']//div[contains(@class,'rt-block')]//div[@class='module-surround']/div[2]/div/div/div/ul/li["+i+"]/a")).click();
			String site =driver.getTitle();
			erori(driver);
			if(site.contains("Axway") || site.contains("tube")) {
				System.out.println("eroare la Links");
			}
			driver.switchTo().window(parentHandle);
			if(!driver.getTitle().equals(titlu)) {
				System.out.println(titlu +"   "+driver.getTitle()+" is not error"); 
			driver.navigate().back();}
				}
			} else {
				erori(driver);
				System.out.println("eroare la Links");
			}
		Set<String> ara = driver.getWindowHandles();
		
		for (String string : ara) {
			driver.switchTo().window(string);
			erori(driver);
			if(!driver.getWindowHandle().equals(parentHandle)) {
			driver.close();}
			}
		driver.switchTo().window(parentHandle);
	
		
		
		return driver;
	}
	
	
	public WebDriver meniujosNews(WebDriver driver) {
		erori(driver);
		int news = driver.findElements(By.xpath("//h2[@class='title'][contains(text(),'Newsletter')]")).size();
		
		if(news !=0) {
			erori(driver);
			driver.findElement(By.xpath("//input[@name='user[name]']")).sendKeys("testUserVauban");
			driver.findElement(By.xpath("//input[@name='user[email]']")).sendKeys("testMailVauban@vauban.ro");
			driver.findElement(By.xpath("//input[@value='Subscribe']")).click();
			if(driver.findElements(By.xpath("//div[@class='alert-message']")).size() == 0) {
				System.out.println("Eroare news mesaj subscribed");
			}
		}else {
			erori(driver);
			System.out.println("eroare news");
		}
		
		return driver;
	}
	
	
	
	public WebDriver industriesCustomers(WebDriver driver) {
		erori(driver);
		int modul = driver.findElements(By.xpath("//div[@class='module-surround']//div[@class='module-content']//div[@class='custom']//div[@style='background:transparent;text-shadow:none']")).size();
		String inceput = driver.getTitle();
		if(modul != 0) {
			int nr = driver.findElements(By.xpath("//div[@class='module-surround']//div[@class='module-content']//div[@class='custom']//div[@style='background:transparent;text-shadow:none']/p")).size();
			for(int i=1 ; i<= nr ; i++) {
				int as= driver.findElements(By.xpath("//div[@class='module-surround']//div[@class='module-content']//div[@class='custom']//div[@style='background:transparent;text-shadow:none']/p["+i+"]/a")).size();
				if(as != 0) {
					driver.findElement(By.xpath("//div[@class='module-surround']//div[@class='module-content']//div[@class='custom']//div[@style='background:transparent;text-shadow:none']/p["+i+"]/a")).click();
					erori(driver);
					if(!driver.getTitle().equals(inceput)) {
						erori(driver);
						relatedinfo(driver);
						erori(driver);
					driver.navigate().back();
					}else if(!driver.getTitle().equals("www.vauban.ro")) {
						System.out.println("Eroare la industries Customers!");
					}
				}
			}
		}
		return driver;
	}
	
	
	public WebDriver Downloads(WebDriver driver) {
		erori(driver);
		
		int nr = driver.findElements(By.xpath("//div[contains(text(),'Download Now')]")).size();
		
		if(nr != 0) {
			driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("numeTest");
			driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("lastnumTest");
			driver.findElement(By.xpath("//input[@id='company']")).sendKeys("CompanyTest");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mail@vauban.ro");
			driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("0720000000");
			Select sel = new Select(driver.findElement(By.xpath("//select[@id='job_title']")));
			
			for(int i=0;i<=8;i++) {
				System.out.println(i);
			sel.selectByIndex(i);
			}
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			if(driver.findElements(By.xpath("//div[@class='downloadSidebarContent']")).size() == 0) {
				System.out.println("Eroare download");
			}			
			driver.navigate().back();
			
		}
		return driver;
	}
	
	//erori(driver);
	public WebDriver erori(WebDriver driver) {
		int size = driver.findElements(By.xpath("//source[@type='video/mp4']")).size() ;
		if(driver.getCurrentUrl().contains("mp4") || driver.getCurrentUrl().contains("Video") || size !=0) {
			Set<String> setul = driver.getWindowHandles();
			for (String string : setul) {
				driver.switchTo().window(string);
				driver.navigate().back();
			}

		}
		return driver;
	}

}
/
/
/
/
/
/
/
/
package PaginiSolutions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Careers {
	
	public WebDriver cariere(WebDriver driver) {
		int nr = driver.findElements(By.xpath("//div[@class='rt-grid-10 rt-omega']/div/ul/li")).size();
		for(int i = 1; i<=nr;i++) {
			driver.findElement(By.xpath("//div[@class='rt-grid-10 rt-omega']/div/ul/li["+i+"]/a")).click();
			JobsLastest(driver);			
			driver.navigate().back();
		}
		
		return driver;
	}
	
	public WebDriver JobsLastest(WebDriver driver) {
		int nr = driver.findElements(By.xpath("//ul[@class='latestnews']/li")).size();
		String initial = driver.getWindowHandle();		
		for(int i=1;i<=nr;i++) {
			driver.findElement(By.xpath("//ul[@class='latestnews']/li["+i+"]/a/span")).click();
			driver.findElement(By.xpath("//a[@class='button smallbutton']")).click();

			Set<String> str =driver.getWindowHandles();
			System.out.println(str.size() +"sizeeee");
			int count =1;
			for (String string : str) {
				System.out.println(driver.getTitle());
				if(count==2) {
					System.out.println("a intrat");
				driver.switchTo().window(string);}
					count++;
			}
			driver.findElement(By.xpath("//input[@id='from_email']")).sendKeys("test@gmail.com");
			driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("testNume");
			driver.findElement(By.xpath("//input[@id='to_email']")).sendKeys("test@gmail.com");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.close();
			driver.switchTo().window(initial);
			driver.navigate().back();
		}
		
		
		for(int i=1;i<=nr;i++) {
			
			driver.findElement(By.xpath("//ul[@class='latestnews']/li["+i+"]/a/span")).click();
			driver.findElement(By.xpath("//a[@id='redbtn']")).click();
			
			Set<String> str =driver.getWindowHandles();
			System.out.println(str.size() +"sizeeee");
			int count =1;
			for (String string : str) {
				System.out.println(driver.getTitle());
				if(count==2) {
					System.out.println("a intrat");
				driver.switchTo().window(string);}
					count++;
			}
			driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("testNume");
			driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("testLastNume");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@gmail.com");
			driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("072121122");
			driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys(" detaliiTest detaliiTest");
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys("orasTest");
			driver.findElement(By.xpath("//input[@id='country']")).sendKeys("TaraTest");
			
			WebElement El = driver.findElement(By.id("'upload_cv'"));
			El.sendKeys("C:\\Users\\iulian.dumitru\\Desktop\\poza.png");
			
			driver.findElement(By.xpath("//button[@id='redbtn']")).click();
			driver.close();
			driver.switchTo().window(initial);
			driver.navigate().back();
		}
		return driver;
	}
}
