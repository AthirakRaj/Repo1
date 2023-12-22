package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junittextverification {
	ChromeDriver driver;
	String s="https://www.amazon.com";

	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get(s);
	}
	@Test
	public void amztest()
	{
		driver.findElement( By.name("email")).sendKeys("9447254066"); 	
	}
	
	@After
	public void tearDown()
	{
	 	driver.quit();
	}
}	
