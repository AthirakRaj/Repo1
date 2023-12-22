package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {
	ChromeDriver driver;
	String baseurl="https://www.google.com";
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void test()
{
	//WebElement searchbutton=(WebElement) driver.findElements(By.name("q"));
	//searchbutton.sendKeys("Books");
	//searchbutton.submit();
	driver.findElement( By.name("q")).sendKeys("Books",Keys.ENTER); 
	//driver.findElement( By.name("btnk")).click(); 
}
@After
public void tearDown()
{
	driver.quit();
}
}