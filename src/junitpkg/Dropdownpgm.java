package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownpgm {
	ChromeDriver driver;
	String Baseurl=" https://register.rediff.com/register/register.php?FormName=user_details";
	
	@Before
	public void set()
	{
		driver=new ChromeDriver();
		driver.get(Baseurl);
	}
	@Test
	public void redifftst()
	{
		//driver.findElement(By.xpath("//input[@name='nameb70c7408']")).sendKeys("ATHIRA",Keys.ENTER);
		//driver.findElement( By.xpath("//input[@name='loginb70c7408']")).sendKeys("athira@gamil.com"); 
		WebElement Days = driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
		Select day = new Select(Days);
		day.selectByIndex(21);
		WebElement Month=driver.findElement(By.xpath(" //*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
		Select month = new Select(Month);
		month.selectByIndex(9);
		WebElement year = driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
		Select yr = new Select(year);
		yr.selectByIndex(23);
	    WebElement countrys =driver.findElement(By.xpath(" //*[@id='country']"));
	    Select country =new Select (countrys);
	    country.selectByIndex(0);
	    //WebElement City=driver.findElement(By.xpath(" //*[@name='cityb70c7408']"));
	    //Select city=new Select(City);
	    //city.selectByIndex(19);
	}
	@After
	public void teardown()
	{
		driver.quit();
	}
}
