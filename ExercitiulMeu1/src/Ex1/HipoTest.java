package Ex1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HipoTest {

	  private WebDriver driver;

	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  Properties prop;
	  
	  @BeforeClass(alwaysRun = true)
	public void logare() throws IOException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\iulian.dumitru\\Downloads\\chromedriver.exe");
		  driver = new ChromeDriver(); 
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    prop= new Properties();
	    FileInputStream filess = new FileInputStream("C:\\Users\\iulian.dumitru\\eclipse-workspace\\ExercitiulMeu1\\datadriveLog.properties");
	    prop.load(filess);
	    
		
	}
	@Test
	public void test() throws Exception{
		System.out.println(prop.getProperty("username"));
	    System.out.println(prop.getProperty("pass"));
	    driver.get("https://www.hipo.ro/locuri-de-munca/angajator/vizualizareAplicari/90907/dataaplicare/desc");
	 //   driver.findElement(By.xpath("//html//li[3]/a[1]/span[1]")).click();
	    Actions a = new Actions(driver);
	       a.moveToElement(driver.findElement(By.xpath("//html//li[3]/a[1]/span[1]"))).build().perform();
	       driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(prop.getProperty("username"));
	       driver.findElement(By.xpath("//li[@class='has-submenu show-submenu']//div[@class='flyout-menu']//form[@method='post']//div[@class='form-row']//input[@type='password']")).sendKeys(prop.getProperty("pass"));
	       driver.findElement(By.xpath("//input[@class='button button-pink'][@value='Login']")).click();
	       driver.get("https://www.hipo.ro/locuri-de-munca/angajator/vizualizareAplicare/4268565");
	      int x= driver.findElements(By.xpath("//html//div[@id='hidethis']/div[4]/div")).size();
	      System.out.println(x);
	      
	      int i=2;
	      String[][] arrayul=new String[x/10][10];
	      int zar=0;
    	  int zar1=0;
	      while(i<=x) {
	    	  String elementX="//*[@id='hidethis']/div[4]/div["+i+"]/div[2]";
	    	  
	    	  System.out.println(driver.findElement(By.xpath(elementX) ).getText()+ "   "+i);
	    	  i++;
	    	
	    	  if(zar1%9 != 0 || zar1==0) {
	    		  arrayul[zar][zar1]=driver.findElement(By.xpath(elementX) ).getText();
	    		  zar1++;
	    	  } else {
	    		  arrayul[zar][zar1]=driver.findElement(By.xpath(elementX) ).getText();
	    		  zar1=0;
	    		  zar++;}
	    System.out.println(zar+"    "+zar1);
	    

	    	  
	      }
	      
	     


	}

}
