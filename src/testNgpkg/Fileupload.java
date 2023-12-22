package testNgpkg;


	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Fileupload {
		ChromeDriver driver;
		String url="https://demo.guru99.com/test/upload";
		@BeforeTest
		public void setup() {
			driver=new ChromeDriver();
			driver.get(url);
		}
		@Test
		public void test() {// file upload using send keys when editText field has present
			driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\Rahul K Murali\\OneDrive\\Pictures\\Screenshots\\Screenshot 2023-09-08 115910.png");
			driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
		}

	}

