package selenium_concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;

public class Explicitwait
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E://Sel//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement e = driver.findElement(By.xpath("//input[@type='submit']"));
		
		//Method 1
		WebDriverWait w1 = new WebDriverWait(driver,10);
		e = w1.until(ExpectedConditions.elementToBeClickable(e));
		e.click();
		
		//Method 2
		WebDriverWait w2 = new WebDriverWait(driver,10);
		e = w2.ignoring(ElementNotFoundException.class).until(ExpectedConditions.elementToBeClickable(e));
		e.click();
		
		
		//Method 3
		new WebDriverWait(driver, 10).ignoring(ElementNotFoundException.class).
				until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@type='submit']"))));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		

	}

}
