package selenium_concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleDynamicTable1
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E://Sel//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("naveenautomation");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.switchTo().frame("mainpanel");
		WebDriverWait w = new WebDriverWait(driver, 5000);
		w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text()='Contacts']"))));
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		//form[@id='vContactsForm']//tr[4]//td[2]/a
		//form[@id='vContactsForm']//tr[6]//td[2]/a
		
		String bx = "//form[@id='vContactsForm']//tr[";
		String ax = "]//td[2]/a";
		for(int i=4;i<=6;i++)
		{
			String name = driver.findElement(By.xpath(bx+i+ax)).getText();
			System.out.println(name);
			if(name.equalsIgnoreCase("ajit kumar"))
				driver.findElement(By.xpath("//form[@id='vContactsForm']//tr["+i+"]//td[1]/input")).click();
		}

	}

}
