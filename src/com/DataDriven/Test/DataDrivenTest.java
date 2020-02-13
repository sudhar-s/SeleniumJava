package com.DataDriven.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Excel.Utility.Xls_Reader;

public class DataDrivenTest
{
	public static void main(String[] args)
	{
		/*System.setProperty("webdriver.chrome.driver", "E://Sel//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.org/register.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
		
		Xls_Reader reader = new Xls_Reader("E://Sel//Workspace//SelPract//src//com//Excel//Utility//RegPageData.xlsx");
		String fname = reader.getCellData("TestData", "FirstName", 2);
		System.out.println(fname);
		
		

	}

}
