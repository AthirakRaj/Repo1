package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	ChromeDriver driver;
	String Baseurl="https://www.facebook.com";
 @Before
 public void setup()
 {
	driver=new ChromeDriver();
	driver.get(Baseurl);
		
}
 @Test
 public void fbtest()
 {
	driver.findElement( By.id("email")).sendKeys("abc@gamil.com"); 
	driver.findElement(By.id("pass")).sendKeys("abc@123");
	driver.findElement(By.name("login")).submit();
 }
 @After
 public void tearDown()
 {
	driver.quit(); 
 }
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

