package java_collections;

import java.util.Hashtable;


public class HashTableConcept
{

	public static void main(String[] args)
	{
		Hashtable ht = new Hashtable(); //Any type of pair(Key,Value) can be used in this Hashtable
		ht.put('A', "First value");
		ht.put('B', 2);
		ht.put('C', 3.0);
		System.out.println(ht.size());
		
		System.out.println(ht.get('C'));
		ht.put(4, 400);
		ht.put(5, "Fifth");
		System.out.println(ht.get(5));
		ht.put(4, "Fourth value");
		System.out.println(ht.get(4));
		System.out.println(ht.size());
		ht.remove(4);
		System.out.println(ht.get(4));
		System.out.println(ht.size());
		
		Hashtable<Integer,Integer> htint = new Hashtable<Integer,Integer>();
		htint.put(1, 100);
		//htint.put('A', 200); //only Integer,Integer pair should be used in this Hashtable
		//htint.put(2, "invalid int"); //only Integer,Integer pair should be used in this Hashtable
		
		Hashtable<Integer,String> htstr = new Hashtable<Integer,String>();
		htstr.put(1, "1st value");
		//htstr.put('B', 2); //only Integer,String pair should be used in this Hashtable
		//htstr.put("third", "3rd val"); //only Integer,String pair should be used in this Hashtable
		
		
		

	}

}
