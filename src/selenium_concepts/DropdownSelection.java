package selenium_concepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelection {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E://Sel//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://in.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Select s = new Select(driver.findElement(By.xpath("//select[@id='gh-cat']")));
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByValue("550");
		Thread.sleep(2000);
		s.selectByVisibleText("Baby");
		
		//Print all options from the drop down
		List<WebElement> li = s.getOptions();
		for(int i=0;i<li.size();i++)
			System.out.println(li.get(i).getText());


	}

}
