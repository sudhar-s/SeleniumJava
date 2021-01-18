package oops_Encapsulation;

public class Browser3
{
	/* Encapsulation --> Wrapping/Hiding the inner data/functionality/coding inside methods and create a 
	public layer(method/constructor). Since the user can use just the core functionality/application.
	But they can not access/view our hided data  */
	
	private String browser;
	
	//Accessing the encapsulated(private) variables by using get & set methods(this keyword)
	
	public String getBrowser()
	{
		return browser;
	}

	public void setBrowser(String browser)
	{
		this.browser = browser;
	}
	
	public void launchBrowser()
	{
		if(browser=="chrome")
			launchChrome();
		else if(browser=="firefox")
			launchFirefox();
		else
			System.out.println("Invalid browser !!!");
	}
	
	/* In the below public methods, we are calling the private methods. But only print statement will be the output for user. 
	They can not view and run the other coding */
	public void launchChrome()
	{
		System.out.println("Launching Chrome * * *");
		checkOS();
		checkDiskSize();
		checkBrowserUpdates();
	}

	public void launchFirefox()
	{
		System.out.println("Launching Firefox * * *");
		checkOS();
		checkDiskSize();
		checkBrowserUpdates();
	}
	
	private void checkOS()
	{
		System.out.println("Checking OS Config");
		String OS = "Windows 7";
		String type = " ";
		if(OS.startsWith("W"))
			type = "32B";
		else
			System.out.println("Not compatable");
	}
	
	private void checkDiskSize()
	{
		System.out.println("Checking Disk size");
		long disksize = 456854;
		if(disksize>40000)
			disksize = disksize+1;
		else
			System.out.println("Disk size is not enough");
	}
	
	private void checkBrowserUpdates()
	{
		System.out.println("Checking Browser Updates");
		String version = "45.258B";
		String v;
		if(version.endsWith("B"))
			v = "Beta version";
		else
			System.out.println("Not a Beta version");
	}
	
}
