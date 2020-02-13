package java_collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept
{

	public static void main(String[] args)
	{
		//ArrayList: A Dynamic array
		//-Can contain duplicate values/elements
		//-Maintains insertion order
		//-Synchronized
		//-Allows random access to fetch elements since it stores the values on the basis of indexes
		
		
		//Non-generic Array List (non-parameterized array list)
		ArrayList al = new ArrayList(); //All type of values can be used in this Array list
		al.add(10);
		al.add('a');
		al.add("Array List");
		al.add(123.456);
		al.add(1545644646);
		System.out.println(al.size());
		System.out.println(al.get(2));
		
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i));
		
		//Generic Array List (parameterized array list)
		ArrayList<Integer> alint = new ArrayList<Integer>(); //only integer values should be used in this Array List
		alint.add(100);
		//alint.add("invalid value for alint");
		//alint.add(10.20);
		
		ArrayList<String> alstr = new ArrayList<String>(); //only string values should be used in this Array List
		alstr.add("String array list");
		//alstr.add(100);
		//alstr.add('a');
		
		//Employee class objects
		Employee e1 = new Employee("Emp1","010","Admin");
		Employee e2 = new Employee("Emp2","020","Acc");
		Employee e3 = new Employee("Emp3","030","HR");
		
		//Create and add values in Array List
		ArrayList<Employee> ald = new ArrayList<Employee>();
		ald.add(e1);
		ald.add(e2);
		ald.add(e3);
		
		//Iterator to traverse the values
		Iterator<Employee> it = ald.iterator();
		while(it.hasNext())
		{
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.eno);
			System.out.println(emp.dept);
		}
		
// ------------------------------------------------------------------------- //	
		
		//Add all method
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("test1");
		al1.add("array list 1");
		for(int i=0;i<al1.size();i++)
			System.out.println("ArrayList1:"+al1.get(i));
		System.out.println("==================");
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("test2");
		al2.add("array list 2");
		al1.addAll(al2);  //Adding all values from al2 to al1
		for(int i=0;i<al1.size();i++)
			System.out.println("ArrayList1:"+al1.get(i));
		System.out.println("==================");

// ------------------------------------------------------------------------- //
		
		//Remove all
		al1.removeAll(al2);  //Removing all values of al2 from al1 
		for(int i=0;i<al1.size();i++)
			System.out.println("ArrayList1:"+al1.get(i));
		System.out.println("==================");
		
// ------------------------------------------------------------------------- //		
		
		//Retain all
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("test");
		al3.add("Retain list 1");
		
		ArrayList<String> al4 = new ArrayList<String>();
		al4.add("test");
		al4.add("Retain list 2");
		
		al3.retainAll(al4); //Retaining common values in al3 which contains the same value from al4
		for(int i=0;i<al3.size();i++)
			System.out.println("Retain List:"+al3.get(i));
		
		for(String str:al4)
			System.out.println("adv for loop"+str);
		
				
	}

}
