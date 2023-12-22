package testNgpkg;
	import java.io.File;
	import java.io.IOException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.io.FileHandler;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Screenshotpgm {
		ChromeDriver driver;
		String url="https://www.demo.guru99.com/test/drag_drop.html";
		@BeforeTest
		public void setup() {
			driver=new ChromeDriver();
			driver.get(url);
	}
		@Test()
		public void test() throws IOException
		{
			File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(screenshot, new File("C:\\Users\\Rahul K Murali\\OneDrive\\Pictures\\Screenshots\\guru99.png"));
			WebElement ownersequitybutton=driver.findElement(By.xpath("//*[@id=\"credit3\"]/a"));
			File buttonscreenshot=ownersequitybutton.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(buttonscreenshot,new File("./Screenshot/buttonscreenshot.png"));
		}	
		}