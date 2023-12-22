package jpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Robloxpgm {
  ChromeDriver driver;
  String url=" https://www.roblox.com/";
 
 @Before
 public void set()
 {
	driver=new ChromeDriver();
	driver.get(url);
	
 }
 @Test
 public void robloxtst()
 {
	 
	//dropdown
	 
	WebElement MONTH=driver.findElement(By.xpath("//*[@id='MonthDropdown']")) ;
	Select month=new Select(MONTH);
	month.selectByIndex(9);
	WebElement DAY=driver.findElement(By.xpath("//*[@id='DayDropdown']"));
	Select day=new Select(DAY);
	day.selectByIndex(21);
	WebElement YEAR=driver.findElement(By.xpath("//*[@id='YearDropdown']"));
	Select year=new Select(YEAR);
	year.selectByIndex(23);
	
	//details
	
	 driver.findElement(By.xpath(" //body[@id='rbx-body']")).sendKeys("4thir@");
	 driver.findElement(By.xpath("//input[@id='signup-password']")).sendKeys("athi@123");
	 
	 //radio button
	 
	 boolean radio=driver.findElement(By.xpath("//*[@id='FemaleButton']")).isSelected();
     if(radio)
     {
   	  System.out.println("selected");
   	 
     }
     else
     {
   	  System.out.println(" not selected"); 
     }
	
	
 }
}
