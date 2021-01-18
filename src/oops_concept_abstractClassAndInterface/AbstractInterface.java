package oops_concept_abstractClassAndInterface;

public interface AbstractInterface
{
	//-Inside an Interface, by default all the methods will be declared as abstract
	//-An Interface contains only Abstract methods. This is called as Full abstract
	//-Methods inside an Interface should be defined as a prototype. It can not contains the method body
	//-Interface method(s) body should be defined inside the implemented class
	//-Variables inside an Interface is also will be considered as a 'final' variable. It can not be changed
	
	//int a;			//-Variables should be initialized in the Interface if we declare
	int a=10; 
	String test = "interface variable";
	
	public void test1();
	public void test2();
	public void test3();
	
	
	
	
}
