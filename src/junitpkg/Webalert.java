package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webalert {
 ChromeDriver driver;
 String Baseurl=" file:///C:/Users/Rahul%20K%20Murali/OneDrive/Desktop/SOFTWARE%20TESTING/webpage.html";

@Before
public void set()
{
	driver=new ChromeDriver();
	driver.get(Baseurl);
}
@Test
public void wbtest()
{
	driver.findElement(By.xpath("//input[@type='button']")).click();
	Alert a=driver.switchTo().alert();//go to alert interface 
	String alerttext=a.getText();
	if(alerttext.equals("Hello i am alert box"))
	{
		System.out.println(" pass");	
	}
	else
	{
		System.out.println("fail");	
	}
	a.accept();
	//a.dismiss to cancel the alert
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Athira");
	driver.findElement(By.xpath(" //input[@name='lastname']")).sendKeys("Raj");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
}
}
