package PaginiSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CompletarePagini {
	
	public WebDriver completareDate(WebDriver driver) {
		
		try {
		driver.findElement(By.xpath("//input[@id='firstname'][@name='firstname']")).click();
		driver.findElement(By.xpath("//input[@id='lastname']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='error']/p")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//p[@class='require-error'][contains(text(),'Please enter Last Name')]")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='email']")).isDisplayed());
		}catch(Exception e) {
			System.out.println("problema cu click-urile");
		}		
		driver.findElement(By.xpath("//input[@id='firstname'][@name='firstname']")).sendKeys("Nume1");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("LastName1");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dumitrufloriniulian@gmail.com");
		driver.findElement(By.xpath("//input[@id='phoneNumber']")).sendKeys("0725430608");
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Freelance");
		driver.findElement(By.xpath("//input[@id='countryRegion']")).sendKeys("Romania");
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("LastName1 + Nume1");
		
		try {
		driver.findElement(By.xpath("//label[@for='newsletter_input']")).click();
		driver.findElement(By.xpath("//label[@for='terms_input']")).click();
//		driver.findElement(By.xpath("//form[@id='contact-form']/fieldset/div[2]/div[2]/div[2]/label")).click();
		}catch(Exception my) {
			System.out.println("problema bifare casute");
		}
		driver.navigate().back();
		driver.findElement(By.xpath("//button[@id='form-submit']")).click();
		
//		PreluareLinkBottom preluare  = new PreluareLinkBottom();
//		preluare.preluareLinkuriBottom(driver);
		
		return driver;
	}
}
