package page;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazonpage {
WebDriver driver;

By amazonsearch=By.xpath("//*[@id=\"twotabsearchtextbox\"]");
By mobilesearch=By.xpath("//*[@id=\"nav-search-submit-button\"]");

public Amazonpage(WebDriver driver) {//constructor
	this.driver=driver;
}
public void setvaues(String mobiles) {
	driver.findElement(amazonsearch).sendKeys(mobiles);
}
public void search() {
	driver.findElement(mobilesearch).click();
}
public void titleverification() {
	String title=driver.getTitle();
	if(title.equalsIgnoreCase("Amazon.in:mobilephones")) {
		System.out.println(title);
		}
}

public void cart() {
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

