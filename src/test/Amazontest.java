package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Amazonpage;


public class Amazontest {

	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void testsearch()
	{
		Amazonpage ob=new Amazonpage(driver);
		ob.setvaues("mobile phones");
		ob.search();
		ob.cart();
}
}