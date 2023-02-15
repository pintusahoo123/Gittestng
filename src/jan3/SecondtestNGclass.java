package jan3;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import config.Apputil;

public class SecondtestNGclass extends Apputil {           // here Apputil is parent class and secondtestNGclas is child class 
	/*@Test
	public void addition() 
	{
		driver.findElement(By.name("display")).sendKeys("9111");
		driver.findElement(By.xpath("(//input[@id='btn'])[6]")).click();
		driver.findElement(By.name("display")).sendKeys("889");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		// i want run time value
		String addresult = driver.findElement(By.name("display")).getAttribute("value");
	    Reporter.log(addresult,true);
		
	}
	@Test
	public void sbustraction()
	{
		driver.findElement(By.name("display")).sendKeys("2000");
		driver.findElement(By.xpath("(//input[@id='btn'])[11]")).click();
		driver.findElement(By.name("display")).sendKeys("500");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		String subresult = driver.findElement(By.name("display")).getAttribute("value");
		Reporter.log(subresult,true);
	}
	@Test
	public void multiplication()
	{
		driver.findElement(By.name("display")).sendKeys("500");
		driver.findElement(By.xpath("(//input[@id='btn'])[16]")).click();
		driver.findElement(By.name("display")).sendKeys("25");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		String mulresult =  driver.findElement(By.name("display")).getAttribute("value");
		Reporter.log(mulresult,true);
		
	}
	 @Test
	 public void division()
	 
	{
		driver.findElement(By.name("display")).sendKeys("50000");
		driver.findElement(By.xpath("(//input[@id='btn'])[21]")).click();
		driver.findElement(By.name("display")).sendKeys("100");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		String mulresult =  driver.findElement(By.name("display")).getAttribute("value");
		Reporter.log(mulresult,true);
		
	}
	

}*/
@Test(priority = 1)             // here priority is use for gives the priority what you want
public void addition() 
{
	driver.findElement(By.name("display")).sendKeys("9111");
	driver.findElement(By.xpath("(//input[@id='btn'])[6]")).click();
	driver.findElement(By.name("display")).sendKeys("889");
	driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
	// i want run time value
	String addresult = driver.findElement(By.name("display")).getAttribute("value");
    Reporter.log(addresult,true);
	
}
@Test(priority = 3,enabled = false)   // here eanbled fasle is use for ignore the specific testcase
public void sbustraction()
{
	driver.findElement(By.name("display")).sendKeys("2000");
	driver.findElement(By.xpath("(//input[@id='btn'])[11]")).click();
	driver.findElement(By.name("display")).sendKeys("500");
	driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
	String subresult = driver.findElement(By.name("display")).getAttribute("value");
	Reporter.log(subresult,true);
}
@Test
public void multiplication()
{
	driver.findElement(By.name("isplay")).sendKeys("500");
	driver.findElement(By.xpath("(//input[@id='btn'])[16]")).click();
	driver.findElement(By.name("display")).sendKeys("25");
	driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
	String mulresult =  driver.findElement(By.name("display")).getAttribute("value");
	Reporter.log(mulresult,true);
	
}
 @Test(enabled = false)
 public void division()
 
{
	driver.findElement(By.name("display")).sendKeys("50000");
	driver.findElement(By.xpath("(//input[@id='btn'])[21]")).click();
	driver.findElement(By.name("display")).sendKeys("100");
	driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
	String mulresult =  driver.findElement(By.name("display")).getAttribute("value");
	Reporter.log(mulresult,true);
	
}
}
