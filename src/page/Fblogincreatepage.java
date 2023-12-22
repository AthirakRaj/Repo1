package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fblogincreatepage {
	WebDriver driver;
	
	By fbcreatepage=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By getstart=By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div");
	
	public Fblogincreatepage(WebDriver driver) 
	{
		this.driver=driver;
		
	}
	public void createpage() {
		driver.findElement(fbcreatepage).click();
	}
	public void getstart()
	{
		driver.findElement(getstart).click();
	}
}

	
