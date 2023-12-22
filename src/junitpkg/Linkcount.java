package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {

	ChromeDriver driver;
	String Baseurl="https:/www.facebook.com";
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get(Baseurl);
}
@Test
public void fbtest()
{
	List<WebElement> linkdetails=driver.findElements(By.tagName("a"));
	System.out.println("total no of links="+linkdetails.size());
	for (WebElement element : linkdetails)
	{
	    String link=element.getAttribute("href");
	    String linkText=element.getText();
	    
	    System.out.println(link+"------- "+linkText);
}
}
}

