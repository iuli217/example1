package itestM;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App implements ITestListener
{
	WebDriver  driver;
	int problemeCount=0;
	
	@BeforeTest
	public void inainte() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver(); 
	    driver.manage().window().maximize();
	    driver.get("http://test.easydoevents.com");

	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("iulian.dumitru@vauban.ro");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("ParolaHardcodata.1");
	    driver.findElement(By.xpath("//button[contains(text(), 'Login')]")).click();
	    driver.findElement(By.xpath("//button[contains(text(), 'Login')]")).click();
	    Thread.sleep(1000);
	    Boolean verificare=true;
	    
	    try {
	    	driver.findElement(By.xpath("//input[@id='email']")).isDisplayed();
	    }catch(Exception e) {
	    	verificare=false;
	    }
   
	    if(verificare) {
	    	driver.findElement(By.xpath("//a[@ui-sref='registerPersonal']")).click();	    	
	    	driver.findElement(By.xpath("//input[@name='firstNameRegisterCompany']")).sendKeys("NumeHardcodat");
	    	driver.findElement(By.xpath("//input[@name='lastNameRegisterCompany']")).sendKeys("PrenumeHardcodat");
	    	driver.findElement(By.xpath("//input[@name='emailRegisterCompany']")).sendKeys("iulian.dumitru@vauban.ro");
	    	driver.findElement(By.xpath("//option[@label='Albania']")).click();
	    	driver.findElement(By.xpath("//div[@class='intl-tel-input allow-dropdown']//input[@type='text']")).sendKeys("0725430608");
	    	driver.findElement(By.xpath("//input[@name='addressRegisterCompany']")).sendKeys("Adresa Hardcodata");
	    	driver.findElement(By.xpath("//input[@name='zipCodeRegisterCompany']")).sendKeys("20000");
	    	driver.findElement(By.xpath("//input[@name='passwordRegisterCompany']")).sendKeys("ParolaHardcodata.1");
	    	driver.findElement(By.xpath("//input[@name='confirmPasswordRegister']")).sendKeys("ParolaHardcodata.1");
	    	driver.findElement(By.xpath("//a[contains(text(), 'terms of service')]")).click();
	    	Boolean ver1 =driver.findElement(By.xpath("//input[@name='firstNameRegisterCompany']")).isDisplayed();
	    	if(!ver1) {
	    		driver.navigate().back();
	    	}
	    	driver.findElement(By.xpath("//a[contains(text(), 'privacy policy')]")).click();
	    	ver1 =driver.findElement(By.xpath("//input[@name='firstNameRegisterCompany']")).isDisplayed();
	    	if(!ver1) {
	    		driver.navigate().back();
	    	}	
	    	driver.findElement(By.xpath("//button[@class='registerButtonNewDesign ng-binding']")).click();
	    }
	    int count=0;
	    do {
	    Thread.sleep(500);
	    try {
	    driver.findElement(By.xpath("//a[@ui-sref='homeAuthenticated']")).click();
	    count+=3;
	    }catch(Exception e) {
	    		count+=1;}
	    }while(count<3);
	}
	
	@Test
	public void testare1() throws InterruptedException {
		int count=0;
		int buclaCont=0;
		do {
		do {
		    Thread.sleep(500);
		    try {
		    	driver.findElement(By.xpath("//a[@ui-sref='userList']")).click();
		    count+=3;
		    }catch(Exception e) {
		    		count+=1;}
		    }while(count<10);
		Boolean ver=true;
		try {
			Thread.sleep(1000);
		driver.findElement(By.xpath("//table[@id='userListTable']//tbody/tr[3]/td[3]/a/img")).isDisplayed();
		ver=true;
		}catch(Exception e){
			ver=false;
		}
		if(ver) {
			driver.findElement(By.xpath("//table[@id='userListTable']//tbody/tr[3]/td[3]/a/img")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//label[@for='roleModerator']")).click();
			driver.findElement(By.xpath("//button[@ng-click='openChangePassModal()']")).click();
			driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("ParolaHardcodata.1");
			driver.findElement(By.xpath("//input[@id='inputPassword2']")).sendKeys("ParolaHardcodata.1");
			driver.findElement(By.xpath("//input[@id='inputPassword3']")).sendKeys("ParolaHardcodata.1");
			if(driver.findElement(By.xpath("//button[@ng-click='changePassword()']")).isEnabled()) {
			driver.findElement(By.xpath("//button[@ng-click='changePassword()']")).click();
			}else {
				problemeCount+=1;
				System.out.println("Este o problema la parola");
			}
			driver.findElement(By.xpath("//button[@class='saveGuestBtn waves-effect waves-teal btn-flat ng-binding ng-isolate-scope'][contains(text(),'Save Changes')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//table[@id='userListTable']/tbody/tr[3]/td[1]/div[1]/label")).click();
			driver.findElement(By.xpath("//button[@type='button'][contains(text(),'Delete user')]")).click();
			}
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@ui-sref='profileUserAdd']")).click();
		Thread.sleep(1000);
		try{driver.findElement(By.xpath("//input[@id='inputFirstName']")).sendKeys("User2");
		
		}catch(Exception es) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='inputFirstName']")).sendKeys("User2");
		}
		driver.findElement(By.xpath("//input[@id='inputLastName']")).sendKeys("DA");
		driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys("dumitrufloriniulian@gmail.com");
		driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("ParolaHardcodata.1");
		driver.findElement(By.xpath("//input[@id='inputPassword3']")).sendKeys("ParolaHardcodata.1");
		driver.findElement(By.xpath("//input[@id='inputPhone']")).sendKeys("0725430608");
		count=1;
		driver.findElement(By.xpath("//div[@class='selected-flag']/div[1]")).click();
		switch(buclaCont) {
			case 0:
		driver.findElement(By.xpath("//label[@for='roleAdministrator']")).click();
		break;
			case 1:
		driver.findElement(By.xpath("//label[@for='roleModerator']")).click();
		break;
			case 2:
		driver.findElement(By.xpath("//label[@for='roleSecurityOfficer']")).click();
		break;
			case 3:
		driver.findElement(By.xpath("//label[@for='roleSecurityManager']")).click();
		break;}
		driver.findElement(By.xpath("//button[@ng-click='save()']")).click();
		
		buclaCont += 1;
		}while(buclaCont<4);

		
	}

	
	@AfterTest
	private void afisare() {
		System.out.println(problemeCount);
		
	}

	public void onFinish(ITestContext arg0) {
		System.out.println(problemeCount);
		
	}

	public void onStart(ITestContext arg0) {
		System.out.println("este inceputul testul");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		System.out.println("este inceput testul");
		
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("este reusit testul");
		
	}
	

}
