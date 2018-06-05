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
