package junitpkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlink {
	  ChromeDriver driver;
	  String Baseurl="https://www.google.com";

	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(Baseurl);
	}
	
	@Test
	public void gotest()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));//locate all the anchor tags on a page.
		System.out.println(li.size());
		for(WebElement ele:li)
		{
			String link=ele.getAttribute("href");
			verifylink(link);
			
		}	
	}

	private void verifylink(String link) {
		try
		{
		       URL u=new URL(link);
				HttpURLConnection con=(HttpURLConnection)u.openConnection();
				con.connect();
				if(con.getResponseCode()==200)
				{
					System.out.println("response code is 200----"+link);
				}
				else if(con.getResponseCode()==200)
				{
					System.out.println("response code is 404----"+link);	
				}
		
	}
	catch (Exception e)
	{
		System.out.println("link is not found");
	}
}
}
