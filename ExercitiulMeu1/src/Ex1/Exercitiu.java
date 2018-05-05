package Ex1;


import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Exercitiu implements ITestListener {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

@BeforeTest
  public void setUp() throws Exception {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\iulian.dumitru\\Downloads\\chromedriver.exe");
    driver = new ChromeDriver(); 
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);   
  }

  @Test
  public void TestCase() throws Exception {
	  driver.get("https://hotelguru.ro/");
	    driver.findElement(By.cssSelector("input.input-large.form-control")).click();
	    driver.findElement(By.cssSelector("input.input-large.form-control")).clear();
	    driver.findElement(By.cssSelector("input.input-large.form-control")).sendKeys("dassa");
	    driver.findElement(By.cssSelector("input.input-large.form-control")).sendKeys(Keys.ENTER);
	    driver.findElement(By.id("header_start_date_d")).click();
	    driver.findElement(By.cssSelector("td.day.start-date.active > span")).click();
	    driver.findElement(By.cssSelector("td.day.week-end.end-date.active > span")).click();
	    driver.findElement(By.cssSelector("span.text")).click();
  }
  
@AfterTest
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      AssertJUnit.fail(verificationErrorString);
    }
  }


@Override
public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("pass");
	
}

@Override
public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("A aparut o eroare");
	

	
}

@Override
public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
}

@Override
public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	
}

@Override
public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	
}
}


