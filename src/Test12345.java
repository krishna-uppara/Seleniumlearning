import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class Test12345 {
	
	@Test(description="dfds",threadPoolSize=3)
	public void test()
	{
		// TODO Auto-generated method stub
					System.setProperty("webdriver.chrome.driver", ".//EXES//chromedriver.exe");
					System.setProperty("webdriver.gecko.driver", ".//EXES//geckodriver.exe");
					// WebDriver driver = new ChromeDriver();
					WebDriver driver = new FirefoxDriver();
			        EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
			        WebDriverListener handler = new WebDriverListener();
			        eventDriver.register( handler);
					eventDriver.get("http://toolsqa.com/automation-practice-switch-windows/");
					
					driver.close();
		
	}

}
