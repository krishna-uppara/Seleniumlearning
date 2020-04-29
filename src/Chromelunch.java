import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chromelunch {

	public static void main(String[] args) throws IOException, AWTException {
		System.out.println("welcome to selenium training ");
		System.setProperty("webdriver.chrome.driver", ".//EXES//chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", ".//EXES//geckodriver.exe");
		// WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ciauto.adaptondemand.com/WebApp/");
		// driver.manage().window().fullscreen();
		// driver.manage().window().maximize();
		System.out.println(driver.manage().window().getPosition().getX());
		System.out.println(driver.manage().window().getPosition().getY());
		System.out.println(driver.manage().window().getSize().getHeight());
		System.out.println(driver.manage().window().getSize().getWidth());
		// // setting the brower position
//		Chromelunch ss = new Chromelunch();
//		ss.openedFolder();
		Dimension d = new Dimension(865, 919);
		driver.manage().window().setSize(d);
		Point point = new Point(700, 0);
		driver.manage().window().setPosition(point);
//		driver.findElement(By.c)
	}

	public void openedFolder() throws IOException, AWTException {
		Robot robot = new Robot();
		Desktop desktop = Desktop.getDesktop();
		File dirToOpen = null;
		try {
			// Wait(10000);
			dirToOpen = new File("E://learning//2019Selenium//src");
			desktop.open(dirToOpen);
			
			robot.keyPress(KeyEvent.VK_ALT);
			robot.keyPress(KeyEvent.VK_SPACE);
			robot.keyPress(KeyEvent.VK_X);
			robot.keyRelease(KeyEvent.VK_ALT);
			robot.keyRelease(KeyEvent.VK_SPACE);
			robot.keyRelease(KeyEvent.VK_X);

		} catch (IllegalArgumentException iae) {
			System.out.println("folder Not Found");
		}


	}

}
