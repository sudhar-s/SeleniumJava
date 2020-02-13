package selenium_concepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLinksAndVariousxpath {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E://Sel//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// -- various types to write simple xpath --		
		/*driver.findElement(By.xpath("//input[@name='fieldinp']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@id='field1']")).sendKeys("test");
		driver.findElement(By.xpath("//input[contains(@name,'fieldinp')]")).sendKeys("test");
		driver.findElement(By.xpath("//input[contains(@id,'field1')]")).sendKeys("test");
		driver.findElement(By.xpath("//input[contains(text(),'fieldinput')]")).sendKeys("test");
		driver.findElement(By.xpath("//input[contains(@id,'f1_')]")).sendKeys("test");
		driver.findElement(By.xpath("//input[starts-with(@id,'f1_ip_')]")).sendKeys("test");
		driver.findElement(By.xpath("//input[ends-with(@id,'_fld_nm')]")).sendKeys("test");*/
		
		//Get links in a web page and print
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int totlinks = links.size();
		System.out.println("Total links: "+totlinks);
		for(int i=0;i<totlinks;i++)
		{
			String link = links.get(i).getText();
			System.out.println(link);
		}
		driver.close();
		
		
	

	}

}
