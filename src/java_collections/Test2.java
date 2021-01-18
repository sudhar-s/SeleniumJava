package java_collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2
{

	public static void main(String[] args)
	{
		Test2 obj = new Test2();
		obj.grade();
		
		
	}
	
	public Test2()
	{
		super();
	}
	
	public void grade()
	{
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("three");
		al.trimToSize();
		System.out.println(al);
		for(int i=al.size()-1;i>=0;i--)
			System.out.println(al.get(i));
		
		/*int mark;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mark:");
		mark = sc.nextInt(); 
		
		if(mark>=91 && mark<=100)
			System.out.println("Grade -> AA");
		else if(mark>=81 && mark<=90)
			System.out.println("Grade -> BB");
		else if(mark>=71 && mark<=80)
			System.out.println("Grade -> CC");
		else if(mark>=61 && mark<=70)
			System.out.println("Grade -> DD");
		else if(mark>=51 && mark<=60)
			System.out.println("Grade -> EE");
		else if(mark>=41 && mark<=50)
			System.out.println("Grade -> FF");
		else if(mark<=40)
			System.out.println("Grade -> Fail");
		else
			System.out.println("Invalid mark");*/
		
	}
	
	 

}
