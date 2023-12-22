package testNgpkg;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Automationtest {
		ChromeDriver driver;
		String url="https://automationexercise.com/";

		@BeforeTest
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get(url);
		}
		@Test(priority=2)
		public void autotst()
		{     
			//signup
			
			driver.findElement(By.xpath(" //*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
			driver.findElement(By.xpath(" //*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("Athira");
			driver.findElement(By.xpath(" //*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("athiraakr9@gmail.com");
			driver.findElement(By.xpath(" //*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
			
			//account info
			
			driver.findElement(By.xpath(" //*[@id=\"id_gender2\"]")).click();
			driver.findElement(By.xpath("//*[@id='password']")).sendKeys("athira@1234");
			WebElement Days = driver.findElement(By.xpath("//*[@id='days']"));
			Select day = new Select(Days);
			day.selectByIndex(21);
			WebElement Month=driver.findElement(By.xpath("//*[@id='months']"));
			Select month = new Select(Month);
			month.selectByIndex(9);
			WebElement year = driver.findElement(By.xpath("//*[@id='years']"));
			Select yr = new Select(year);
			yr.selectByIndex(23);
			driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("ATHIRA");
			driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("RAJ");
			driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("KOLLIYIL (H)");
			driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("KOLLIYIL (H)");
			 WebElement Country =driver.findElement(By.xpath(" //*[@id=\"country\"]"));
			  Select country =new Select (Country);
		      country.selectByIndex(0);
		      driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("Kerala");
		      driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Kottayam");
		      driver.findElement(By.xpath(" //*[@id=\"zipcode\"]")).sendKeys("786579");
		      driver.findElement(By.xpath(" //*[@id=\"mobile_number\"]")).sendKeys("9446713329");
		      driver.findElement(By.xpath(" //*[@id=\"form\"]/div/div/div/div[1]/form/button")).submit();
		}
		@Test(priority=1)
		public void logintest()
		{
			driver.findElement(By.xpath(" //*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
			driver.findElement(By.xpath(" //*[@id=\"form\"]/div/div/div/div[1]/form/button"));
			driver.findElement(By.xpath(" //*[@id=\"form\"]/div/div/div[1]/div/form/input[2]"));
			driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button "));
			
			
			
			String exptdurl=" https://automationexercise.com/";
			String currenturl=driver.getCurrentUrl();
			
			if(currenturl.equals(exptdurl))
			{
				System.out.print("currenturl");
			}
			
			else
			{
				System.out.println("url is different");
				System.out.println("Actual url is "+currenturl);
				
			}
			
		}
	}
