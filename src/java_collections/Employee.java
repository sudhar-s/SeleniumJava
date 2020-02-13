package java_collections;

public class Employee
{
	String name;
	String eno;
	String dept;
	
	Employee(String name, String eno, String dept)
	{
		this.name = name; //match the global & local variables by using 'this' keyword
		this.eno  = eno;
		this.dept = dept;
	}

}
