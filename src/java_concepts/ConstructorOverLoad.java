package java_concepts;

public class ConstructorOverLoad
{
	ConstructorOverLoad()  //Constructor- A method which has the same name of the class
	{
		System.out.println("Default Constructor");
	}

	ConstructorOverLoad(int c) //Overloading a constructor like a method
	{
		System.out.println("Overloaded/Parameterised Constructor: "+c);
	}
	
	ConstructorOverLoad(char c) //Overloading a constructor like a method
	{
		System.out.println("Overloaded/Parameterised Constructor: "+c);
	}
	ConstructorOverLoad(String c) //Overloading a constructor like a method
	{
		System.out.println("Overloaded/Parameterised Constructor: "+c);
	}
	ConstructorOverLoad(char s, String d) //Overloading a constructor like a method
	{
		System.out.println("Overloaded/Parameterised Constructor: "+s);
		System.out.println("Overloaded/Parameterised Constructor: "+d);
	}
	
	public static void main(String args[])
	{
		ConstructorOverLoad c1 = new ConstructorOverLoad();	  //Constructors will be called when we create an object for class
		ConstructorOverLoad c2 = new ConstructorOverLoad(10);
		ConstructorOverLoad c3 = new ConstructorOverLoad('d');
		ConstructorOverLoad c4 = new ConstructorOverLoad("string parameter");
		ConstructorOverLoad c5 = new ConstructorOverLoad('^',"string parameter");
		
	}
}
