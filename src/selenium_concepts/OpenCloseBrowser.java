package selenium_concepts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;


public class OpenCloseBrowser {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\chromedriver\\chromedriver.exe");
		/*WebDriver chrome = new ChromeDriver();
		chrome.get("https:\\www.google.com");
		chrome.close();*/
		
		/*System.setProperty("webdriver.gecko.driver", "E:\\Sel\\geckodriver\\geckodriver.exe");
		WebDriver firefox = new FirefoxDriver();
		firefox.get("https:\\www.google.com");
		firefox.close();
		
		System.setProperty("webdriver.ie.driver", "E:\\Sel\\IEDriver\\IEDriverServer.exe");
		WebDriver iep = new InternetExplorerDriver();
		iep.get("https:\\www.google.com");
		iep.close();*/
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		//driver.get("https://www.google.com/");
		//driver.get("https://jqueryui.com/droppable");
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		/*driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("E:/Sel/Workspace/SelPract/src/selenium_concepts/config.properties");
		prop.load(fis);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop.getProperty("forgot_pwd_xpath"))).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}		
