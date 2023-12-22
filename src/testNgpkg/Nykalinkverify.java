package testNgpkg;
	import java.net.HttpURLConnection;
	import java.net.URL;
	import java.util.List;

	import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Nykalinkverify {
		ChromeDriver driver;

		@Before
		public void SetUp()
		{
			driver=new ChromeDriver();
			driver.get("https://www.nykaa.com/");
		}
		@Test
		public void nykaatest()
		{
			List<WebElement> list=driver.findElements(By.tagName("a"));
			System.out.println(list.size());
			for(WebElement ele:list)
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

