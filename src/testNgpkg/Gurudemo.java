package testNgpkg;
	import org.junit.experimental.theories.Theories;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Gurudemo {
		ChromeDriver driver;
		String url="https://demo.guru99.com/test/simple_context_menu.html";
		@BeforeTest
		public void setup() {
			driver=new ChromeDriver();
			driver.get(url);
	}
		@Test()
		public void test1() throws InterruptedException{
			WebElement element=	driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
			Actions act=new Actions(driver);
			act.contextClick(element).perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span")).click();
			Alert a=driver.switchTo().alert();
			a.accept();
			
			}
		@Test
		public void test2() throws InterruptedException {
			WebElement right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
			Actions act=new Actions(driver);
			Thread.sleep(3000);
			act.doubleClick(right).perform();
			Thread.sleep(3000);
			Alert alert=driver.switchTo().alert();
			String alertText=alert.getText();
			if(alertText.equals("You double clicked me.. Thank You..")) {
				System.out.println("pass");
			}else {
				System.out.println("failed");
			}
			alert.accept();
		}
		}


