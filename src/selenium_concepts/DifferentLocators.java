package selenium_concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentLocators {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E://Sel//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("login1")).sendKeys("testing");
		driver.findElement(By.name("passwd")).sendKeys("sample");
		driver.findElement(By.linkText("Forgot Password?")).click();
		driver.findElement(By.className("f14 bold form-label")).isDisplayed();
		driver.findElement(By.partialLinkText("https://register.rediff.com/utilities/newforgot")).click();
		driver.findElement(By.tagName("input")).click();
		driver.findElement(By.cssSelector("#login1")).sendKeys("test");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("test");
		driver.findElement(By.xpath("//a[contains(text(),'Create a new account')]")).click();
		


	}

}
