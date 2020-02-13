package selenium_concepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBootstrapDropdown2
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_3");
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en_US&continue=" +
				"https%3A%2F%2Fmyaccount.google.com%2Fintro&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		List<WebElement> li = driver.findElements(By.xpath("//div[@class='ry3kXd Ulgu9']//descendant::span[@class='vRMGwf oJeWuf']"));
		for(int i=0;i<li.size();i++)
			System.out.println(li.get(i).getText());
		
		
		
		
		
		

	}

}
