package jan6;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class True_asserts {
	WebDriver driver;
	@Test
	public void verify_title()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.rediff.com/");
		String expected ="Google";
		String actual = driver.getTitle();
		try {
		Assert.assertTrue(actual.equalsIgnoreCase(expected), "title is not matching");  
		}
		catch (Throwable t) 
		{
			System.out.println(t.getMessage());   
			                 
		}
		driver.quit();
	}

}
// assert true also returns when testcase is false

