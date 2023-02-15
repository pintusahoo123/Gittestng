package jan6;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Equal_asserts {         //  i want to verify two string and get the titlle of string
	WebDriver driver;
	@Test
	public void verify_title()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.rediff.com/");
		String expected ="Google";
		String actual = driver.getTitle();
		// i want handle exception- then, use try catch
		try {
		Assert.assertEquals(actual, expected,"title is not matching");   
		}
		catch (Throwable t) 
		{
			System.out.println(t.getMessage());   // t.getmessage returns detailed error message in try catch
			//t.printStackTrace();                   // it print exception along with error message
		}
		driver.quit();
	}

   
}


// if two string matched it won't print message 
// if test case failed then it print message
//here assert is a testNG class
// t is an object, it is throwable class object- t is holding exception and error what we are getting in block of code