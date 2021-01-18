package oops_concept_abstractClassAndInterface;

public class TestAbstractClass extends FullAbstractClass
{
	public static void main(String[] args)
	{
		FullAbstractClass fa = new TestAbstractClass(); //Top-casting done here since we can not create direct object for an abstract class
		fa.method1();
		fa.method2();
		fa.method3();
		fa.a = 20;
		System.out.println(fa.a);
		
		

	}
	
	public void testMethod1()
	{
		
	}

	@Override
	public void method1()
	{
				
	}

	@Override
	public void method2()
	{
		
	}

	@Override
	public void method3()
	{
			
	}

}
