package testNgpkg;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventest {
	WebDriver driver;
	String url="https://www.facebook.com";	
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void test() throws Exception
	{
		FileInputStream f=new FileInputStream("C:\\Users\\Rahul K Murali\\OneDrive\\Desktop\\Book3.xlsx");
		
		
	XSSFWorkbook wb=new XSSFWorkbook(f);
	XSSFSheet sh=wb.getSheet("Sheet1");
	int count=sh.getLastRowNum();
	for(int i=1;i<=count;i++)
	{
		String uname=sh.getRow(i).getCell(0).getStringCellValue();
		String pswd=sh.getRow(i).getCell(1).getStringCellValue();
		System.out.println("username=" +uname);
		System.out.println("password=" +pswd);
		driver.findElement(By.name("email")).sendKeys(uname);
		driver.findElement(By.name("pass")).sendKeys(pswd);
		driver.findElement(By.name("login")).submit();
		
	}	
		
	}
	
}
