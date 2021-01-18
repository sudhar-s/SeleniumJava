package java_exercise;

public class OverLoad2Method
{
	void display()
	{
		System.out.println("Default method");
	}
	
	void display(int i, String s)
	{
		System.out.println("Overloaded method: ");
		System.out.println("Id: "+i);
		System.out.println("Name: "+s);
	}
	
	public static void main(String[] args)
	{
	
		OverLoad2Method l1 = new OverLoad2Method();
		l1.display();
		l1.display(5, "Test user");

	}

}
