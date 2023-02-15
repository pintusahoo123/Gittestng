package jan5;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import net.sourceforge.htmlunit.corejs.javascript.ast.SwitchCase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Using_parameter {
	WebDriver driver;
	@Parameters({"Browser"})
	@BeforeTest
	public void beforeTest(String brw) {
		switch (brw) {
		case "chrome":
			System.out.println("executing on chrome browser");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			break;
		case "firefox":
			System.out.println("executing on firefox browser");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			

		default:
			System.out.println("browser key value not matching");
			break;
		}
		
	}

	@DataProvider
	public Object[][] dp() {
		Object login [][]= new Object[5][2];
		login [0][0]="Admin";
		login [0][1]="Qedge123!@#";
		login [1][0]= "Adim";
		login [1][1]="Qedge123!@#";
		login [2][0]="Admin";
		login [2][1]="Qedge123";
		login [3][0]="Admi";
		login [3][1]="Qedge123";
		login [4][0]="Admin";
		login [4][1]="Qedg";
		return login;
	}
	@Test(dataProvider = "dp")
	public void verify_login(String username ,String password) {
		driver.get("http://orangehrm.qedgetech.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("username");
		driver.findElement(By.name("txtPassword")).sendKeys("password");
		driver.findElement(By.name("Submit")).click();
		// do some validation
		String expected ="dashboard";
		String actual= driver.getCurrentUrl();
		if (actual.contains(expected)) {
			Reporter.log("login succes : :"+expected+"   "+actual);

		}
		else
		{
			Reporter.log("login failed : :"+expected+"    "+actual);
		}
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}

