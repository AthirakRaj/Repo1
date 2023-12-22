package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		 
		//edge-EdgeDriver()
		//firefox-FirefoxDriver()
		ChromeDriver driver=new ChromeDriver();//to launch site
		driver.get("https://www.google.com");//to open site
		String extitle="google";
		String actualtitle=driver.getTitle();
		System.out.println("title="+actualtitle);
		if(actualtitle.equalsIgnoreCase(extitle))
		{
			System.out.println("pass");	
		}
		else
		{
			System.out.println("failed");
		}

	}

}
