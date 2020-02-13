package java_concepts;

public class FinalizeConcept
{
	public static void main(String[] args)
	{
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		f1 = null; //Object reference has been deleted and object will be empty here
		f2 = null; //Object reference has been deleted and object will be empty here
		//Like those empty objects in memory will be cleaned by using finalize method
		System.gc(); // calling default garbage collector to clean-up the memory
	}
	
	public void finalize()
	{
		System.out.println("Finalize method");
	}
	
	/*
	Output will be:
	Finalize method
	Finalize method
	Here, finalize method will be called before the Garbage collector to clean-up the memory by default (if it is declared)
	since the method called two times in this class */
}
