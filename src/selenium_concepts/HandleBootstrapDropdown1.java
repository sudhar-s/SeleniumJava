package selenium_concepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBootstrapDropdown1 {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_3");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		List<WebElement> li = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i).getText());
			if(li.get(i).getText().equals("Web Development"))
				li.get(i).click();
			else if(li.get(i).getText().equals("Programming Languages"))
				li.get(i).click();
			else if(li.get(i).getText().equals("Databases"))
				li.get(i).click();
		}
		
		
		
		
		
		
		

	}

}
