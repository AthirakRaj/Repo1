package testNgpkg;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Parameters;


public class Crossbrowsertesting {
		WebDriver driver;
		@Parameters("browser")
		@BeforeTest
		public void setup(String browser)
		{
			
			if(browser.equalsIgnoreCase("chrome"))
		{
		       driver=new ChromeDriver();
		}
		
			else if(browser.equalsIgnoreCase("edge"))
					{
						driver=new EdgeDriver();
		}
			else
			{
				driver=new FirefoxDriver();
			}
			
			
				

	}
	}