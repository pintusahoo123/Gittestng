package jan3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Primus {
	WebDriver driver;
	@Test(invocationCount = 4)  //invocation count is used for invoke testcases more than 1 time
	public void login()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://primusbank.qedgetech.com/");
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		driver.quit();
		
	}

}
