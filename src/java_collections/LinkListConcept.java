package java_collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListConcept 
{
	public static void main(String[] args)
	{
		LinkedList<String> ll1 = new LinkedList<String>();
		
		//Add elements
		ll1.add("one");
		ll1.add("two");
		ll1.add("three");
		ll1.add("four");
		ll1.add("five");
		
		//Print all elements
		System.out.println("Link list elements are: "+ll1);
		
		//Add 1st & last elements directly
		ll1.addFirst("first");
		ll1.addLast("last");
		System.out.println("Link list elements are: "+ll1);
		
		//Get specific element
		System.out.println(ll1.get(0));
		System.out.println(ll1.get(2));
		
		//Set(modify) specific element
		ll1.set(0, "modified first");
		ll1.set(2, "modified 2");
		System.out.println(ll1.get(0));
		System.out.println(ll1.get(2));
		
		System.out.println("Link list elements are: "+ll1);
		
		//Remove specific element
		ll1.remove(5);
		System.out.println("Link list elements are: "+ll1);
		
		//Remove first & last
		ll1.removeFirst();
		System.out.println("Link list elements are: "+ll1);
		ll1.removeLast();
		System.out.println("Link list elements are: "+ll1);
		
		//To print all the values
		
		System.out.println("Using for loop:");
		for(int i=0;i<ll1.size();i++)
			System.out.println(ll1.get(i));
		
		System.out.println("Using advance for loop:");
		for(String str:ll1)
			System.out.println(str);
		
		System.out.println("Using iterator:");
		Iterator<String> it = ll1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("Using while loop:");
		int n=0;
		while(ll1.size()>n)
		{
			System.out.println(ll1.get(n));
			n++;
		}

	}

}
