package java_concepts;

public class ConstructorSuperKeyword_Child extends ConstructorSuperKeyword_Parent
{
	public ConstructorSuperKeyword_Child()
	{
		super(); //super keyword should be written as first statement inside the child class constructor
		System.out.println("Child class Default Constructor");
	}
	public ConstructorSuperKeyword_Child(String test)
	{
		super(test);
		System.out.println("Child class Overloaded Constructor");
	}
	
	public static void main(String[] args)
	{
		ConstructorSuperKeyword_Child ct = new ConstructorSuperKeyword_Child();
		ConstructorSuperKeyword_Child ct1 = new ConstructorSuperKeyword_Child("param const");
		

	}

}
