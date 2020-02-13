package selenium_concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBrowserTest
{
	public static void main(String[] args)
	{
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.navigate().to("http://www.amazon.in");
		System.out.println(driver.getTitle());
		driver.navigate().to("http://www.google.com");
		System.out.println(driver.getTitle());
		
	}

}
