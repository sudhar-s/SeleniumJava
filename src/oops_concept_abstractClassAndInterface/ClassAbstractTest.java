package oops_concept_abstractClassAndInterface;

public class ClassAbstractTest extends ClassAbstract 
{
	public static void main(String[] args)
	{
		ClassAbstractTest ca = new ClassAbstractTest();
		ca.test3(); 
		ca.test1();
		ca.test2();
		ca.test11();
		ca.a=20;
		System.out.println(ca.a);
		
		//ClassAbstract c = new ClassAbstract(); //we can not create object for the abstract class
	}
	
	@Override
	public void test1() //abstract method body defined here
	{
		System.out.println("Abstract method 1");
	}
	
	@Override
	public void test2() //abstract method body defined here
	{
		System.out.println("Abstract method 2");
	}
	
	public void test11()
	{
		System.out.println("Non over-ridden method");
	}

}
