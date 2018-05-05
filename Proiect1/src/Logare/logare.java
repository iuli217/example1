package Logare;

import java.io.IOException;
import java.util.ArrayList;

import java.util.List;



import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class logare extends scriereExcel {

	public static String log() throws IOException {
		String succes=null;
		String info=null;
		List<String> lista = new ArrayList<String>();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\iulian.dumitru\\Downloads\\chromedriver.exe");	 
		WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();
        String baseUrl = "https://www.linkedin.com/";
        driver.get(baseUrl);

        driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("");
        driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("");
        driver.findElement(By.xpath("//input[@id='login-submit']")).click();
        driver.navigate().to("https://www.linkedin.com/mynetwork/invite-connect/connections/");
        
        
        
        
        List<WebElement> lista1 = new ArrayList<WebElement>();
        try {  for(int i=0;i<=10000;i++) {
         	 lista1 = (List<WebElement>) driver.findElements(By.xpath("//span[@class='mn-connection-card__name Sans-17px-black-85%-semibold-dense']"));	 
          }
        }catch(Exception e) {
     	   
        }

          for (WebElement we : lista1) {
     		System.out.println(we);
     	}
         

// scriereExcel.scriere(lista);

        return succes;

}

}

