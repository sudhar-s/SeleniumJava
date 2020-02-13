package selenium_concepts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ObjectRepository1
{
	public static void main(String[] args) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("E:/Sel/Workspace/SelPract/src/selenium_concepts/config.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("name"));
		WebDriver driver;
		String browser = prop.getProperty("browser");
		String url	   = prop.getProperty("url");
		
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E://Sel//chromedriver//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
		}
		else if(browser.equals("ff"))
		{
			System.setProperty("webdriver.gecko.driver", "E://Sel//geckodriver//geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
		}
		else
			System.out.println("-- Enter valid browser name --");
		

	}

}
