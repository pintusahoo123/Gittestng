package jan6;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.gargoylesoftware.css.dom.Property;

public class Propertyfile {
	WebDriver driver;
	Properties p;
	@Test
	public void verify_login() throws Throwable
	{
		/*p = new Properties();
		p.load(new FileInputStream("C:\\Qedge_selenium\\TestNG_Framework\\Login_properties.properties"));
		driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(p.getProperty("URL"));
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath(p.getProperty("Objaccount"))).click();
		 driver.findElement(By.xpath(p.getProperty("Objlogin"))).click();
		 driver.findElement(By.xpath(p.getProperty("Objemail"))).sendKeys("pintu@1234");
		 driver.findElement(By.xpath(p.getProperty("Objpassword"))).sendKeys("pintu12");
		 driver.findElement(By.xpath(p.getProperty("Objloginbtn"))).click();
		 driver.close();*/



		p = new Properties();
		p.load(new FileInputStream("C:\\Qedge_selenium\\TestNG_Framework\\Login_properties.properties"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getProperty("URL"));
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(p.getProperty("Objaccount"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(p.getProperty("Objlogin"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(p.getProperty("Objemail"))).sendKeys(p.getProperty("enteremail"));
		driver.findElement(By.xpath(p.getProperty("Objpassword"))).sendKeys(p.getProperty("enterpassword"));
		driver.findElement(By.xpath(p.getProperty("Objloginbtn"))).click();
		Thread.sleep(2000);
		driver.close();
	}
}

