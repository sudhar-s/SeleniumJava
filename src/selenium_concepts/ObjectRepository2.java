package selenium_concepts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepository2
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("E:/Sel/Workspace/SelPrac/src/selenium_concepts/config.properties");
		prop.load(fis);
		
		String browsername = prop.getProperty("browser");
		String url = prop.getProperty("url");
				
		WebDriver driver;
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E://Sel//chromedriver//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.id(prop.getProperty("uname_id"))).sendKeys(prop.getProperty("uname"));
			driver.findElement(By.id(prop.getProperty("pwd_id"))).sendKeys(prop.getProperty("pwd"));
			driver.findElement(By.xpath(prop.getProperty("go_btn_xpath"))).click();
			
			driver.findElement(By.id(prop.getProperty("uname_id_l"))).clear();
			driver.findElement(By.xpath(prop.getProperty("forgot_pwd_xpath"))).click();
			
			Thread.sleep(1000);
			driver.quit();
			
			
		}

	}

}
