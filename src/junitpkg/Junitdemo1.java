package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo1 {
	ChromeDriver driver;
	String baseurl="https://www.google.com";
	
	@Before
	public void set()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
    @Test
    public void testing()
    {
    	String s=driver.getPageSource();
    	if(s.contains("Gmail"))			
    	{
    		System.out.println("pass");
    	}
    	else
    	   {
    		System.out.println("fail");
    		}
    }
@After
public void teardown()
{
	driver.quit();
}
    }
