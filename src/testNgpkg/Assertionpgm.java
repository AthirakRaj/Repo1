package testNgpkg;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertionpgm {
	ChromeDriver driver;
	String url="https://www.google.com";
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get(url);
		
	}
	@Test
	public void test()
	{
		String exptitle="Googl";
		String actualtitle=driver.getTitle();
		if(actualtitle.equals(exptitle))
		Assert.assertEquals(actualtitle,exptitle);
		System.out.println("title verified");
		
	}	
	
}
