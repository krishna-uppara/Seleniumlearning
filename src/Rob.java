import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rob {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", ".//EXES//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
//		driver.findElement(By.xpath("//div[@class=]//input[@value='Google Search']")).click();

		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_Z);r.keyPress(KeyEvent.VK_Z);r.keyPress(KeyEvent.VK_Z);r.keyRelease(KeyEvent.VK_Z);r.keyRelease(KeyEvent.VK_Z);r.keyRelease(KeyEvent.VK_Z);
			driver.findElement(By.xpath("//div[@class=''tfB0Bf'']//input[@value='Google Search']")).click();
			r.mousePress(InputEvent.BUTTON3_MASK);
			Thread.sleep(10000);
			r.mouseRelease(InputEvent.BUTTON3_MASK);
				

		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
driver.close();
	}

}
