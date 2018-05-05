package Ex1;

import java.util.regex.Pattern;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercitiu3 implements ITestListener {
  private WebDriver driver;

  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  

  
  
  @BeforeClass(alwaysRun = true)
  public void setUp() throws IOException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\iulian.dumitru\\Downloads\\chromedriver.exe");
	  driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    Properties prop= new Properties();
    FileInputStream filess = new FileInputStream("C:\\Users\\iulian.dumitru\\eclipse-workspace\\ExercitiulMeu1\\datadriveLog.properties");
    prop.load(filess);
    System.out.println(prop.getProperty("username"));
  
  }

  @Test
  public void testUntitledTestCase() throws Exception {

    driver.get("https://www.google.ro/search?q=input+data&rlz=1C1EJFA_enRO779RO779&oq=input+data&aqs=chrome..69i57j69i59l2j0l3.6437j0j7&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.linkText("HTML Input Types - W3Schools")).click();
    driver.findElement(By.linkText("❮ Previous")).click();
    driver.findElement(By.linkText("❮ Previous")).click();
    driver.findElement(By.linkText("Input Data")).click();
   
    driver.findElement(By.cssSelector("#u30964-4 > div.bc_ch_wrapper > p")).click();
    driver.findElement(By.cssSelector("#u31034-4 > div.bc_ch_wrapper > h3")).click();
    driver.findElement(By.cssSelector("#u59038-4 > div.bc_ch_wrapper > p")).click();

    Assert.assertFalse(driver.findElement(By.cssSelector("#u59026-4 > div.bc_ch_wrapper > h3")).isSelected());
    driver.get("https://www.google.ro/search?q=input+data&rlz=1C1EJFA_enRO779RO779&oq=input+data&aqs=chrome..69i57j69i59l2j0l3.6437j0j7&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.linkText("input data - Traducere în română - exemple în engleză | Reverso ...")).click();
    driver.findElement(By.cssSelector("a.translation-link")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    driver.close();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
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


