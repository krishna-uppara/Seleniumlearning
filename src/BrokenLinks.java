import java.io.IOException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException, InterruptedException,MalformedURLException {
		int brokenlink=0,validbrokenlink=0;
		System.out.println("welcome to selenium training ");
		System.setProperty("webdriver.chrome.driver", ".//EXES//chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", ".//EXES//geckodriver.exe");
		// WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/default.asp");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int linkcount = links.size();
		System.out.println("number of links present " + linkcount);

		List<WebElement> activelinks = new ArrayList<WebElement>();
		for (int i = 0; i < linkcount; i++) {
			System.out.println(links.get(i).getAttribute("href"));
			if (links.get(i).getAttribute("href") != null && !links.get(i).getAttribute("href").contains("javascript:void(0)") )

			{
				activelinks.add(links.get(i));
			}
		}

		System.out.println("active links " + activelinks.size());

		for (int j = 0; j < activelinks.size(); j++) {
			URL url = new URL(activelinks.get(j).getAttribute("href"));
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(100000);
			conn.connect();
			String response = conn.getResponseMessage();
			int responsecode = conn.getResponseCode();
			if(responsecode>=400)
			{
				brokenlink++;
				System.out.println(" Broken Link" + activelinks.get(j).getAttribute("href") + response + responsecode );
			}
			
			else 
			{
				validbrokenlink++;
				System.out.println("Valid link" + activelinks.get(j).getAttribute("href") + response + responsecode);
							
			}
			conn.disconnect();
		}
		
		
		System.out.println("total number broken links " + brokenlink);
		System.out.println("total number valid links " + validbrokenlink);
		driver.close();driver.quit();
	}

}
