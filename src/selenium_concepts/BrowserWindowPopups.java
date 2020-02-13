package selenium_concepts;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPopups
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E://Sel//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #1')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #2')]")).click();
		
		//WindowHandler API to get the window IDs and store in a Set
		Set<String> wh = driver.getWindowHandles();
		
		//Iterate the driver control to navigate to the window IDs stored in the Set<object>
		Iterator<String> it = wh.iterator();
		String id1 = it.next();           //iterator points to the first ID in Set(parent window Id)
		System.out.println("Parent window id:\n"+id1);
		String id2 = it.next();           //iterator points to the second ID in Set(child window Id)
		System.out.println("Child window id:\n"+id2);
		
		driver.switchTo().window(id2);   //switch driver control to child window
		System.out.println("Child(pop-up) window Title is:\n"+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(id1);   //switch driver control to parent window
		System.out.println("Parent window Title is:\n"+driver.getTitle());
		driver.close();
		
	}

}
