package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fbloginpage;

public class Fblogintest {

	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void testlogin()
	{
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setvalues("UN", "pswd");
		ob.Clicklogin();
		//Fbcreatepage ob1=new Fbcreatepage(driver);
	}	
	
}
