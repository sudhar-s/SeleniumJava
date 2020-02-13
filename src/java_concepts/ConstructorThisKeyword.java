package java_concepts;

public class ConstructorThisKeyword
{
	String name;
	int sno;
	String name1;
	
	public ConstructorThisKeyword(String name, int sno)
	{
		System.out.println(name);
		System.out.println(sno);
		this.name = name; //initialize the global variable(s) to constructor variable 
		this.sno  = sno;
		name1 = name;
	}
	
	public static void main(String[] args)
	{
		//System.out.println(name);
		//System.out.println(sno);
		ConstructorThisKeyword c = new ConstructorThisKeyword("constructor param",2);
		

	}

}
