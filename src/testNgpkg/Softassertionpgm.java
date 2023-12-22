package testNgpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Softassertionpgm {
ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get("http://www.google.com");
	
	}
	
	@Test
	public void test()
	{
	
	String exptitle="hoogle";
	String actualtitle=driver.getTitle();
	System.out.println("Title="+actualtitle);
	if(actualtitle.equalsIgnoreCase(exptitle))
	{
		System.out.println("pass");
		}
	else
	{
		System.out.println("Fail");
		}
	System.out.println("Text is verified");
	}
	

}
