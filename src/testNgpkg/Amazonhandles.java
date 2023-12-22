package testNgpkg;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonhandles {
ChromeDriver driver;
String url="https://www.amazon.in";
@BeforeTest
public void setup() {
	driver=new ChromeDriver();
	driver.get(url);
}
@Test
public void test() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobilephones");
	driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	String title=driver.getTitle();
	if(title.equalsIgnoreCase("Amazon.in:mobilephones")) {
		System.out.println(title);
		}
	
	String parentwindow=driver.getWindowHandle();
	driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	Set<String> allwindow=driver.getWindowHandles();
	for(String handle:allwindow) {
		if(!handle.equalsIgnoreCase(parentwindow)) {
			driver.switchTo().window(handle);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;  
			   js.executeScript("window.scrollBy(0,500)");
			driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
			
			  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")));
		      driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
		}
		driver.switchTo().window(parentwindow);
	}
}
}