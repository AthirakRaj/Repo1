package jpkg;

import java.time.Duration;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ajiopgm {
	ChromeDriver driver;
	String Baseurl="https://www.ajio.com/";
    
	@Before
     public void set()
        {  
           driver=new ChromeDriver();
           driver.get(Baseurl);
       }  
   
     @Test
      public void ajtst()
         { 
    	   //click
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       WebElement women= driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[1]/ul/li[2]/a"));
	       Actions act=new Actions(driver);
	       act.moveToElement(women).perform();
            //logo display
			boolean logo=driver.findElement(By.xpath(" //*[@id=\"appContainer\"]/div[1]/div/header/div[2]/a/img")).isDisplayed();
			if(logo) {
				System.out.println("displayed");
			}
			else {
				System.out.println("not displayed");
			}
			{
				List<WebElement> linkdetails=driver.findElements(By.tagName("a"));
				System.out.println("total no of links="+linkdetails.size());
				for (WebElement element : linkdetails)
				{
				    String link=element.getAttribute("href");
				    //String linkText=element.getText();
				    
				    //System.out.println(link+"------- "+linkText);
	       
                 }

             }
             }
}

        