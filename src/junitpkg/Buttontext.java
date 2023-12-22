package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttontext {
	ChromeDriver driver;
	String Baseurl=" https://register.rediff.com/register/register.php?FormName=user_details";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(Baseurl);	
	}
	@Test
	public void teardown()
	{
	String  buttontext= driver.findElement(By.xpath("//*[contains (@name,'btnchkavail')]")).getAttribute("value");
	    if(buttontext.equals("CheckAvailability"))
	    		{
	    	        System.out.println("pass");
	    		}
	    else
	    {
	    	System.out.println("fail");
	    }
	
	}
}
