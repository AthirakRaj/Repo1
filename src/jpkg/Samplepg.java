package jpkg;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Samplepg {
	ChromeDriver driver;
	String Baseurl="https://www.instagram.com/";

@Before
public void set()
{
	driver=new ChromeDriver();
	driver.get(Baseurl);
	
}
@Test
public void test()
{
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("athirakraj2001@gmail.com" ,Keys.ENTER);
	
	//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("athi@123");
	//driver.findElement(By.name("")).submit();
}
@After
public void up()
{
	driver.quit();
}
}
