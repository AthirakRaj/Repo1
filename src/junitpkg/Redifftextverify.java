package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redifftextverify {
	ChromeDriver driver;
	String Baseurl=" https://register.rediff.com/register/register.php?FormName=user_details";
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(Baseurl);	
	}
   @Test
   public void redifftest()
   {
	     boolean radio= driver.findElement(By.xpath(" //*[@id='tblcrtac']/tbody/tr[24]/td[3]/input[1]")).isSelected();
	      if(radio)
	      {
	    	  System.out.println("selected");
	    	 
	      }
	      else
	      {
	    	  System.out.println(" not selected"); 
	      }
   }
	
}
