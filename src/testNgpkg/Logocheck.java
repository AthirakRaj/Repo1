package testNgpkg;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Logocheck {
		ChromeDriver driver;
		String url="https://register.rediff.com/register/register.php?FormName=user_details";
		
		@BeforeTest
		public void setup() {
			driver=new ChromeDriver();	
			
			}
		@BeforeMethod
		public void logoloading() {
			driver.get(url);
		}
		@Test
		public void logocheck() {
			boolean logo=driver.findElement(By.xpath("//img[@title='Rediff.com']")).isDisplayed();
			if(logo) 
			{
				System.out.println("displayed");
			}
			else 
			{
				System.out.println("not displayed");
			}
		}
		@AfterTest
		public void logotst()
		{
			driver.quit();
		}

}

