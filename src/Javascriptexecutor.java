import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Javascriptexecutor {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".//EXES//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Index.html");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String readystate = js.executeScript("return document.readyState").toString();
		System.out.println(readystate);
		if(readystate.equals("complete"))
		{
			System.out.println("dsasadsa");
			js.executeScript("window.setTimeout(arguments[arguments.length-1],10000);");
			System.out.println("sdsadsas");
			String title = js.executeScript("return document.title").toString();
			System.out.println(title);
			String buttonname  = js.executeScript(" return document.getElementById('btn1').innerHTML").toString();
			System.out.println(buttonname);
//			String buttonattribute  = js.executeScript(" return document.getElementById('btn1').className.").toString();
//			System.out.println(buttonattribute);
		}
		String close ="window.onbeforeunload = null;" + "window.close();"
		;
 
//				"window.close()";
		js.executeScript(close);
		//driver.close();
//		js.executeScript("document.getElementById('email').value='krishna'" );
//		
	}

}
