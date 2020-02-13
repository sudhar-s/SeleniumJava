package java_concept_abstractClassAndInterface;

public class AbstractInterfaceTest implements AbstractInterface
{
	public static void main(String[] args)
	{
		AbstractInterfaceTest at = new AbstractInterfaceTest();
		at.test11();
		at.test1();
		at.test2();
		at.test3();
		
		// AbstractInterface a = new AbstractInterface(); //we can not create object for the Interface

	}
	
	public void test11()
	{
		System.out.println("Own method");
	}
	
	@Override 
	public void test1()  //--> Abstract/Interface method body defined here
	{
		System.out.println("Overridden method 1");
	}
	
	@Override 
	public void test2()  //--> Abstract/Interface method body defined here
	{
		System.out.println("Overridden method 2");
	}
	
	@Override
	public void test3()  //--> Abstract/Interface method body defined here
	{
		System.out.println("Overridden method 3");
	}
}
