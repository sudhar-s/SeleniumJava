package selenium_concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleCalendar1 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E://Sel//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*boolean b1 = driver.findElement(By.linkText("Home")).isDisplayed();
		boolean b2 = driver.findElement(By.linkText("Sign Up")).isDisplayed();
		
		System.out.println(b1);
		System.out.println(b2);*/

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("naveenautomation");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[text()='Calendar']")).click();
		String date = "1-February-2020";
		String dateval[] = date.split("-");
		String day = dateval[0];
		String month = dateval[1];
		String year = dateval[2];
		
		WebDriverWait w = new WebDriverWait(driver,2000);
		WebElement mm = driver.findElement(By.xpath("//select[@name='slctMonth']"));
		w.until(ExpectedConditions.elementToBeClickable(mm));
		Select m = new Select(driver.findElement(By.xpath("//select[@name='slctMonth']")));
		m.selectByVisibleText(month);
		Thread.sleep(1000);
		WebElement yy = driver.findElement(By.xpath("//select[@name='slctYear']"));
		w.until(ExpectedConditions.elementToBeClickable(yy));
		Select y = new Select(driver.findElement(By.xpath("//select[@name='slctYear']")));
		y.selectByVisibleText(year);
		Thread.sleep(1000);
		String bx = "//tr//tr//tr//tr//tr[";  ////tr//tr//tr//tr//tr[2]//td[3]
		String ax = "]//td[";
		Boolean flag = false;
		
		for(int row=2;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
				String seldate = driver.findElement(By.xpath(bx+row+ax+col+"]")).getText();
				System.out.println(seldate);
				if(seldate.equals(day))
				{
					driver.findElement(By.xpath(bx+row+ax+col+"]")).click();
					flag = true;
					break;
				}
			}
			if(flag)
				break;
		} 
		

	}

}
