package selenium_concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class HandleCalendarRedbus
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E://Sel//chromedriver//chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.ENTER);
		WebElement to = driver.findElement(By.xpath("//input[@id='dest']"));
		to.sendKeys("Bengaluru");
		Thread.sleep(1000);
		to.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//label[text()='Onward Date']")).click();
		driver.findElement(By.xpath("(//tr[@class='rb-monthHeader']//following::tr//following::tr//td[@class='current day'])[2]")).click();
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		
		//Date selection xpath:
		//(//tr[@class='rb-monthHeader']//following::tr//following::tr//td[@class='current day'])[2]
		//(//tr[@class='rb-monthHeader']//following::tr)[2]//td[@class='current day']
		

	}

}
