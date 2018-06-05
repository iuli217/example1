package PaginiSolutions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class relatedInfo {
	
	public WebDriver relatedinfo(WebDriver driver) {
		
		String parentHandle = driver.getWindowHandle();
		String titlu = driver.getTitle(); 
		int dtsheet = driver.findElements(By.xpath("//div[contains(text(),'Datasheets:')]")).size();
		int casestud = driver.findElements(By.xpath("//div[contains(text(),'Case Studies:')]")).size();
		
		int lg=0;
		if(dtsheet !=0 & casestud !=0) {
		lg = driver.findElements(By.xpath("//div[@class='sidebarBorderRadius']/div[2]/div")).size();
		
		System.out.println(lg +titlu);
		for(int i=2;i<lg;i++) {
			driver.findElement(By.xpath("//div[@class='sidebarBorderRadius']/div[2]/div["+i+"]/a[1]")).click();			
			driver.switchTo().window(parentHandle);	
			if(!driver.getTitle().equals(titlu)) {
				System.out.println(lg +titlu +"   "+driver.getTitle()); 
			driver.navigate().back();}
			}
		}
		
		
		
		if(dtsheet !=0 & casestud !=0) {
		System.out.println("trece si pe aici");
		lg=driver.findElements(By.xpath("//div[@class='sidebarBorderRadius']/div[3]/div")).size();
		System.out.println("trece si pe aici" + lg);
		for(int i=2;i<=lg;i++) {
			driver.findElement(By.xpath("//div[@class='sidebarBorderRadius']/div[3]/div["+i+"]/a")).click();
			driver.switchTo().window(parentHandle);	
			if(!driver.getTitle().equals(titlu)) {
				Downloads(driver);
				System.out.println(lg +titlu +"   "+driver.getTitle()); 
			driver.navigate().back();}
		}
		
		Set<String> ara = driver.getWindowHandles();
		
		for (String string : ara) {
			driver.switchTo().window(string);
			driver.close();
			}
		}else if(dtsheet !=0 & casestud ==0) {
			System.out.println("trece si pe aici");
			lg=driver.findElements(By.xpath("//div[@class='sidebarBorderRadius']/div[2]/div")).size();
			System.out.println("trece si pe aici" + lg);
			for(int i=2;i<=lg;i++) {
			driver.findElement(By.xpath("//div[@class='sidebarBorderRadius']/div[2]/div["+i+"]/a")).click();				
				driver.switchTo().window(parentHandle);	
				if(!driver.getTitle().equals(titlu)) {
					Downloads(driver);
					System.out.println(lg +titlu +"   "+driver.getTitle()); 
				driver.navigate().back();}
			}
			String  now = driver.getTitle();
			Set<String> ara = driver.getWindowHandles();
			
			for (String string : ara) {
				driver.switchTo().window(string);
				if(!driver.getTitle().equals(now)) {
				driver.close();
					}
				}
			
			ara = driver.getWindowHandles();
			for (String string : ara) {
				driver.switchTo().window(string);

				}
		}
		
		
		return driver;
		
	}
	
	
	
	public WebDriver meniuJosLinks(WebDriver driver) {
		String parentHandle = driver.getWindowHandle();
		String titlu = driver.getTitle(); 
		int links = driver.findElements(By.xpath("//h2[contains(text(),'Useful Links')]")).size();
		
		if(links != 0) {
			
			for(int i=1;i<=3;i++) {
			driver.findElement(By.xpath("//div[@class='rt-grid-3 rt-alpha']//div[contains(@class,'rt-block')]//div[@class='module-surround']/div[2]/div/div/div/ul/li["+i+"]/a")).click();
			String site =driver.getTitle();
			if(site.contains("Axway") || site.contains("tube")) {
				System.out.println("eroare la Links"+driver.getCurrentUrl());
			}
			driver.switchTo().window(parentHandle);
			if(!driver.getTitle().equals(titlu)) {
				System.out.println(titlu +"   "+driver.getTitle()+" is not error"); 
			driver.navigate().back();}
				}
			} else {
				System.out.println("eroare la Links");
			}
		Set<String> ara = driver.getWindowHandles();
		String  now = driver.getTitle();
		for (String string : ara) {
			driver.switchTo().window(string);
			if(!driver.getTitle().equals(now)) {
			driver.close();
				}
			}
		ara = driver.getWindowHandles();
		for (String string : ara) {
			driver.switchTo().window(string);
			}
		
		
		return driver;
	}
	
	
	public WebDriver meniujosNews(WebDriver driver) {
		int news = driver.findElements(By.xpath("//h2[@class='title'][contains(text(),'Newsletter')]")).size();
		
		if(news !=0) {
			driver.findElement(By.xpath("//input[@name='user[name]']")).sendKeys("testUserVauban");
			driver.findElement(By.xpath("//input[@name='user[email]']")).sendKeys("testMailVauban@vauban.ro");
			driver.findElement(By.xpath("//input[@value='Subscribe']")).click();
			if(driver.findElements(By.xpath("//div[@class='alert-message']")).size() == 0) {
				System.out.println("Eroare news mesaj subscribed"+driver.getCurrentUrl());
			}
		}else {
			System.out.println("eroare news"+driver.getCurrentUrl());
		}
		
		return driver;
	}
	
	
	
	public WebDriver industriesCustomers(WebDriver driver) {
		int modul = driver.findElements(By.xpath("//div[@class='module-surround']//div[@class='module-content']//div[@class='custom']//div[@style='background:transparent;text-shadow:none']")).size();
		String inceput = driver.getTitle();
		if(modul != 0) {
			int nr = driver.findElements(By.xpath("//div[@class='module-surround']//div[@class='module-content']//div[@class='custom']//div[@style='background:transparent;text-shadow:none']/p")).size();
			for(int i=1 ; i<= nr ; i++) {
				int as= driver.findElements(By.xpath("//div[@class='module-surround']//div[@class='module-content']//div[@class='custom']//div[@style='background:transparent;text-shadow:none']/p["+i+"]/a")).size();
				if(as != 0) {
					driver.findElement(By.xpath("//div[@class='module-surround']//div[@class='module-content']//div[@class='custom']//div[@style='background:transparent;text-shadow:none']/p["+i+"]/a")).click();
					
					if(!driver.getTitle().equals(inceput)) {
					driver.navigate().back();
					}else if(!driver.getTitle().contains("www.vauban.ro")) {
						System.out.println("Eroare la industries Customers!"+driver.getCurrentUrl());
					}
				}
			}
		}
		return driver;
	}
	
	
	public WebDriver Downloads(WebDriver driver) {
		String titlu = driver.getTitle();
		
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
				System.out.println("Eroare download"+driver.getCurrentUrl());
			}			
			driver.navigate().back();
			
		}
		return driver;
	}

}
