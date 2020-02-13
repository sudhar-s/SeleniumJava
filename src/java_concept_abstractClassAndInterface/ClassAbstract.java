package java_concept_abstractClassAndInterface;

public abstract class ClassAbstract
{
	//-Abstract method should be defined only inside abstract class
	//-Abstract method in abstract class should be defined as a prototype. It can not contains the method body
	//-Abstract method body should be defined inside the inherited class
	//-In abstract class we can create both Abstract & Non-Abstract methods. This is called as Partial abstract
	
	public abstract void test1(); // --> abstract method  
	public abstract void test2(); // --> abstract method
	public void test3()
	{
		System.out.println("Non abstract method");
	}
	
	
}
