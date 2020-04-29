import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;

public class Actionsclass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", ".//EXES//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		//driver.navigate().to("http://www.google.com");
//		// TODO Auto-generated method stub
//		Actions action = new Actions(driver);
//		WebElement eee = driver.findElement(By.id("dfds"));
//		action.keyDown(driver.findElement(By.id("dfds")), Keys.CONTROL);
//		action.click(eee).build().perform();
//		action.clickAndHold(eee).perform();
//		action.contextClick(eee);
//		action.doubleClick(eee);
//		action.dragAndDrop(eee, eee);
//		action.moveToElement(eee);
//		action.sendKeys(eee,Keys.ENTER);
//		action.keyDown(eee, Keys.ENTER);
//		action.keyUp(eee, Keys.ENTER);
//		action.release(eee);
//		action.pause(2000);		


	}

}
