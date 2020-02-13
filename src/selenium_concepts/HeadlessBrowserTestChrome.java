package selenium_concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowserTestChrome
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E://Sel//chromedriver//chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("window-size=1400,800");
		opt.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://classic.crmpro.com/index.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("naveenautomation");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		System.out.println(driver.getTitle());
		

	}

}
