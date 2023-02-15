package jan6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class False_asserts {
	WebDriver driver;
	@Test
	public void verify_title()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		String expected ="Google";
		String actual = driver.getTitle();
		try {
		Assert.assertFalse(actual.equalsIgnoreCase(expected), "title is matching");
		}
		catch (Throwable t) 
		{
			System.out.println(t.getMessage());   
			                 
		}
		driver.quit();
	}

}
// hwen testcase is true it returns message