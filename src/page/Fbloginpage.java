package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpage {
	
	WebDriver driver;
	//locating login button
   @FindBy(name="login")
   WebElement loginbutton;
 
 //locating login button
   @FindBy(name="email")
   WebElement emailField ;
 
 //locating login button
   @FindBy(name="pass")
    WebElement pswd;
 
   
   public Fbloginpage(WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   
   //Clicking on loginbutton
   
   public void Clicklogin()
   {
	  loginbutton.click();
	   }  
//specify email and password
   
   public void setvalues(String email,String password)
   {
	   emailField.sendKeys(email);
	   pswd.sendKeys(password);
   }

}
