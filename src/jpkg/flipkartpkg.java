package jpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartpkg {
	ChromeDriver driver;
	String Baseurl="https://www.flipkart.com/";

	@Before
    public void set()
    {  
	driver=new ChromeDriver();
	driver.get(Baseurl);
    }
	
	@Test
	public void fktest()
	{
	   
		driver.findElement(By.xpath( "//input[@name='q']")).sendKeys("Mobiles", Keys.ENTER);
		
	}
	@After
	public void stop()
	{
		driver.quit();
	}

}
