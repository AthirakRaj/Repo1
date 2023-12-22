package testNgpkg;


	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	public class Facebooklogin {
		ChromeDriver driver;
		String baseurl="https://www.facebook.com";
		@BeforeTest
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get(baseurl);
		}
		@Parameters({"email","pswd"})
		@Test
		public void test(String email,String pswd)
		{
			driver.findElement(By.name("email")).sendKeys("athira@gmail.com");
			driver.findElement(By.name("pass")).sendKeys("athi123");
			driver.findElement(By.name("login")).submit();
		}

	}
