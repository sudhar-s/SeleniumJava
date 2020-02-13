package selenium_concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E://Sel//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo/trigger-hover.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"))).build().perform();
		Boolean b;
		b = driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-edit']")).isDisplayed();
		if(b==true)
			System.out.println("Menu item is visible");
		else
			System.out.println("Menu item not visible");

	}

}
