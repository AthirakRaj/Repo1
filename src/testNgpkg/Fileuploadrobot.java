package testNgpkg;


	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.Toolkit;
	import java.awt.datatransfer.StringSelection;
	import java.awt.event.KeyEvent;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Fileuploadrobot {
		ChromeDriver driver;
		String url="https://www.ilovepdf.com/word_to_pdf";
		@BeforeTest
		public void setup() {
			driver=new ChromeDriver();
			driver.get(url);
		}
		@Test
		public void test() throws AWTException, Exception {
			driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
			fileupload("C:\\Users\\Rahul K Murali\\OneDrive\\Desktop\\Anoopassignment.docx");
		}
		private void fileupload(String p) throws AWTException, InterruptedException {
			StringSelection strselection=new StringSelection(p);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);
			
			Robot robot=new Robot();
			Thread.sleep(2000);
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyPress(KeyEvent.VK_CONTROL);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);

}
}

