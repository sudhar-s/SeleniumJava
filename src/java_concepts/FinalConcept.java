package java_concepts;

public class FinalConcept
{
	public static void main(String[] args)
	{
		//Final keyword:
		//- used to define the constant values
		//- used to prevent Inheritance
		//- used to prevent Method Overriding
		
		int n = 10;
		n = 20;
		System.out.println("Value of n: "+n);
		n = 30;
		System.out.println("Value of n: "+n);
		
		final int fn = 10;
		System.out.println("Value of fn: "+fn);
		//fn = 20;
		System.out.println("Value of fn: "+fn);
	}

}
