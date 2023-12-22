package jpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Meeshosite {
	ChromeDriver driver;
	String s="https://www.meesho.com/";
@Before
public void set() 
{
	driver=new ChromeDriver();
	driver.get(s);	
}
@Test
public void meeshotst()
{
	//driver.findElement(By.xpath(" ")).submit();
	List<WebElement> linkdetails=driver.findElements(By.tagName("a"));
	System.out.println("total no of links="+linkdetails.size());
}	
}
