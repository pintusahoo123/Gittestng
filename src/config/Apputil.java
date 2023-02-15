package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Apputil {
	public static WebDriver driver;          // i use static method because i want to acces  in other class anywhere i want
	@BeforeMethod 
	public static void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://calc.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	@AfterMethod

	public static void teardown()
	{
		driver.quit();

	}


}
