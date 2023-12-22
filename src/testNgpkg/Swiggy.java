package testNgpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Swiggy {
	ChromeDriver driver;
	String url="https://www.swiggy.com/";

@BeforeTest
public void setUp()
{
   driver=new ChromeDriver();
   driver.get(url);
}
@BeforeMethod
public void logoloading() {
	driver.get(url);
}
@Test
public void logocheck() {
	boolean logo=driver.findElement(By.xpath("//*[@id='root']/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/svg")).isDisplayed();
	if(logo) 
	{
		System.out.println("displayed");
	}
	else 
	{
		System.out.println("not displayed");
	}
}
@Test
public void swiggytest()
{
	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/div/a[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9447253066");
	driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Paru K Nair");
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("nairparu3@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div/form/div[2]/a")).click();
		
}
@AfterTest
public void logotst()
{
	driver.quit();
}

}
	
