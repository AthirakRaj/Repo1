package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.Fblogincreatepage;
public class Fbcreatepagetest {

	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void testcreatepage() {
		Fblogincreatepage fbcreate=new Fblogincreatepage(driver);
		fbcreate.createpage();
		fbcreate.getstart();
	}	
	
}





























