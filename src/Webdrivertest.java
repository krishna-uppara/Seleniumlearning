
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Webdrivertest {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", ".//EXES//chromedriver.exe");
			System.setProperty("webdriver.gecko.driver", ".//EXES//geckodriver.exe");
			// WebDriver driver = new ChromeDriver();
			WebDriver driver = new FirefoxDriver();
	        EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
	        WebDriverListener handler = new WebDriverListener();
	        eventDriver.register( handler);
			eventDriver.get("http://toolsqa.com/automation-practice-switch-windows/");
			WebElement element = eventDriver.findElement(By.id("colorVar"));
			element.click();
			eventDriver.unregister(handler);
			eventDriver.quit();
			System.out.println("end");

		

	}

}
