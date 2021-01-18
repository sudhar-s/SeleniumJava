package oops_Encapsulation;

public class BrowserTest 
{

	public static void main(String[] args)
	{
		Browser1 b1 = new Browser1();
		b1.launchBrowser("chrome");
		
		Browser2 b2 = new Browser2("firefox");
		
		Browser3 b3 = new Browser3();
		b3.setBrowser("chrome");
		b3.getBrowser();

	}

}
