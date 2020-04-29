import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Table {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", ".//EXES//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println("total number of columns in a table "+columns.size());
		int count = columns.size();
		for (WebElement e : columns)
		{
			System.out.print(e.getText());
		}
		
		
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		List<WebElement> column = driver.findElements(By.xpath("//table[@id='customers']//tr//td"));
		System.out.println("total number of rows in a table "+column.size());
		int counts = columns.size();
		for (WebElement e : column)
		{
			System.out.print(e.getText());
			System.out.println();
		}
//		for(int i=0; i<count;i++)
//		{
//			System.out.println(columns.get(i).getText());
//		}
		
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.attributeContains(By.id("customers"), "id","customers"));
//		Wait wait1 = new FluentWait(driver)
//				.withTimeout(30, TimeUnit.SECONDS)
//				.pollingEvery(4, TimeUnit.SECONDS)
//				.ignoring(Exception.class)
//				.until(arg0)
		
	}

}
