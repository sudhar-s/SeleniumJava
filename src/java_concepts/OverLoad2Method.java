package java_concepts;

public class OverLoad2Method
{
	
	void display()
	{
		System.out.println("Default method");
	}
	
	void display(int i, String s)
	{
		System.out.println("Overloaded method 1: ");
		System.out.println("Id: "+i);
		System.out.println("Name: "+s);
	}
	
	void display(String s, int i)
	{
		System.out.println("Overloaded method 2: ");
		System.out.println("Name: "+s);
		System.out.println("Id: "+i);	
	}
	 static void main(String s)
	 {
		 System.out.println(s);
	 }
	
	public static void main(String[] args)
	{
	
		OverLoad2Method l1 = new OverLoad2Method();
		l1.display();
		l1.display(5, "Test user");
		l1.display("User Test", 4);
		main("ovld main");
	}
	

}
