package java_concepts;

public class FinallyConcept
{
	public static void main(String[] args)
	{
		test1();

	}
	
	public static void test1()
	{
		int a = 1;
		try
		{
			System.out.println("Inside try block");
			int b = a/0;
			System.out.println("Value of b: "+b);	
		}
		//catch(NullPointerException e)
		/*catch(ArithmeticException e)
		{
			System.out.println("Inside catch block");
			System.out.println("Divide by zero error");
		}*/
		finally
		{
			int i = 2;
			int j = 5;
			System.out.println("Even after the exception this block works:");
			if(i>j)
				System.out.println("i is big");
			else
				System.out.println("j is big");
		}
	}

}
