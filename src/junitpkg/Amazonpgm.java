package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonpgm {
	ChromeDriver driver;
	String Baseurl="https://www.amazon.in/";

	
	@Before
	public void setup () throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get(Baseurl);
		//driver.manage().window().maximize();
		Thread.sleep(10000);
	}
	@Test
	public void amztest(){
	driver.findElement(By.xpath(" //input[@id='twotabsearchtextbox']")).sendKeys("Phones");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	driver.findElement(By.xpath(" //*[@id='nav-xshop']/a[5]")).click();
	//driver.findElement(By.xpath(" //*[@id='nav-cart-icon nav-sprite']")).click();
	List<WebElement> linkdetails=driver.findElements(By.tagName("a"));
	System.out.println("total no of links="+linkdetails.size());
	for (WebElement element : linkdetails)
	{
	    String link=element.getAttribute("href");
	    String linkText=element.getText();
	    
	    System.out.println(link+"------- "+linkText);
}
	}
}


