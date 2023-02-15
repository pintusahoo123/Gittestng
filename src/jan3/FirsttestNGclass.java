package jan3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class FirsttestNGclass {
 WebDriver driver;                         // declare globally
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("http://primusbank.qedgetech.com/");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Reporter.log(" running in beforetest",true);   //,true is used for printing in console tab other wise it print in html tag
  }                                                                    
  @Test
  public void pbanking() throws Throwable {
	  driver.findElement(By.xpath("(//img)[4]")).click();
	  Thread.sleep(3000);
	  Reporter.log("executing pbanking test",true);
  }
  @Test
  public void cbanking() throws Throwable {
	  driver.findElement(By.xpath("(//img)[5]")).click();
	  Thread.sleep(3000);
	  Reporter.log("execute cbanking test",true);
  }
  @Test
  public void ibanking() throws Throwable {
	  driver.findElement(By.xpath("(//img)[6]")).click();
	  Thread.sleep(3000);
	  Reporter.log("execute i banking test",true);
  }
  /*@Test
  public void aboutus() throws Throwable {
	  driver.findElement(By.xpath("(//img)[7]")).click();
	  Thread.sleep(3000);
	  Reporter.log("execute about us",true);
  }*/

  @AfterTest
  public void afterTest() {
	  driver.close();
	  Reporter.log("running in aftertest",true);
  }

}
