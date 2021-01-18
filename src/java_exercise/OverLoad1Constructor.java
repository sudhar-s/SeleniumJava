package java_exercise;

public class OverLoad1Constructor
{
	OverLoad1Constructor()
	{
		System.out.println("Default Constructor");
	}

	OverLoad1Constructor(int c)
	{
		System.out.println("Overloaded/Parameterised Constructor: "+c);
	}
	
	public static void main(String args[])
	{
		OverLoad1Constructor l1 = new OverLoad1Constructor();
		
		OverLoad1Constructor l2 = new OverLoad1Constructor(10);
		
	}
}
