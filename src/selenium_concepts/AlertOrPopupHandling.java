package selenium_concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertOrPopupHandling {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E://Sel//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		Alert a = driver.switchTo().alert();
		a.accept();
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		a.dismiss();
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		System.out.println(a.getText());
		a.dismiss();
		driver.close();
		
	

	}

}
