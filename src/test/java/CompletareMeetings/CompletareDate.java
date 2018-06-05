package CompletareMeetings;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CompletareDate {
	
	//    //label[contains(text(),'Request a meeting')]
	public WebDriver completare(WebDriver driver) {
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("TestAutomat");
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("TestQA");
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("VAUBAN");
		Select sel = new Select(driver.findElement(By.xpath("//select[@id='job_title']")));
		sel.selectByVisibleText("Director");
		sel.selectByVisibleText("Finance");
		sel.selectByVisibleText("IT");
		sel.selectByVisibleText("Sales");
		sel.selectByVisibleText("Marketing");
		sel.selectByVisibleText("Production");
		sel.selectByVisibleText("Logistics");
		sel.selectByVisibleText("Supply Chain");
		
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("0721000000");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testAutomat@vauban.com");
		
		Select topic = new Select(driver.findElement(By.xpath("//select[@id='topic']")));
		topic.selectByVisibleText("Services");
		topic.selectByVisibleText("Products");
		topic.selectByVisibleText("Price Quote");
		topic.selectByVisibleText("Training");
		topic.selectByVisibleText("Maintenance");
		topic.selectByVisibleText("Repost a security issue");
		topic.selectByVisibleText("Other");
		
		driver.findElement(By.xpath("//textarea[@id='your_request']")).sendKeys("am creat teste automate pentru pagina vauban");
		try{
			
			WebElement webElement = driver.findElement(By.xpath("//textarea[@id='your_request']"));//You can use xpath, ID or name whatever you like
			webElement.sendKeys(Keys.TAB);
			webElement.sendKeys(Keys.ENTER);
			webElement.sendKeys(Keys.ENTER);
			
			
			
			
//			driver.switchTo().frame(4);
//		Actions act = new Actions(driver);
//		WebElement element = driver.findElement(By.linkText("Send your request"));
//	    act.moveToElement(element,10,10).click().build().perform();
//		
//		
//		System.out.println(driver.getWindowHandle());
//		driver.findElement(By.xpath("//span[@id='recaptcha-anchor']/div[5]")).click();
		}
		catch(Exception e) {System.out.println("nu e frame 4");}
//		driver.switchTo().defaultContent();
		
		
		
		//     //iframe[@sandbox='allow-forms allow-popups allow-same-origin allow-scripts allow-top-navigation allow-modals allow-popups-to-escape-sandbox'][@style='']
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		return driver;	
	}
	

}
