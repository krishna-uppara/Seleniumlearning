import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cooky {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".//EXES//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		Cookie addcookie = new Cookie("krishna" , "Krishna1987");
		driver.manage().addCookie(addcookie);
		Set<Cookie> allcooky = driver.manage().getCookies();
		Iterator<Cookie> it = allcooky.iterator();
		while(it.hasNext())
		{
			String name = it.next().getName();
			String value = it.next().getValue();
			System.out.println(it.next());
			System.out.println(" cookie name" + name + "cookie value" + value );
		}
		driver.close();

	}

}
