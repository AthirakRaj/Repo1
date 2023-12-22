package testNgpkg;

	import java.io.IOException;
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Fileuploadauto {
		ChromeDriver driver;
		String url="https://www.ilovepdf.com/word_to_pdf";
		@BeforeTest
		public void setup() 
		{
			driver=new ChromeDriver();
			driver.get(url);
		}
	@Test
	public void test() throws InterruptedException, IOException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		//Thread.sleep(3000);
		Runtime.getRuntime().exec("\"C:\\Users\\Rahul K Murali\\Downloads\\Autoit\\At.exe\"");
		Thread.sleep(3000);
	}
	}

