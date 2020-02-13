package selenium_concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicBrowserActions {

	/*public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E://Sel//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();

	}*/
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E://sel//chromedriver//chromdriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	driver.close();
}
}
