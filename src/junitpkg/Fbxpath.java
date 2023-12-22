package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbxpath {
	ChromeDriver driver;
	String Baseurl="https://www.facebook.com/";

	@Before
	public void set()
	{
		driver=new ChromeDriver();
		driver.get(Baseurl);
	}
	@Test
	public void fbtest()
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abc@123");
		driver.findElement(By.xpath(" //button[@name='login']")).click();
	}
	@After
	public void tearDown()
	{
		driver.quit();
	}	
}
