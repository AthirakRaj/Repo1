package testNgpkg;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Copyandpaste {
	ChromeDriver driver;
	String baseurl="https://en-gb.facebook.com/";
	
	@BeforeTest
	public void SetUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void test()
	{
		WebElement email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		WebElement password=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
				email.sendKeys("athira@123");
		Actions act=new Actions(driver);
		act.keyDown(email,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(email,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.keyDown(password,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		act.perform();
		}
	@AfterTest
	public void  stop()
	{
     driver.quit();
}

}