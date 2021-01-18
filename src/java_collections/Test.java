package java_collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test
{
	public static void main(String[] args)
	{
		
		//odd();
		//prime();
		//ArrayListEx();
		test();
	}
	
	public static void odd()
	{
		int odd;
		for(odd=1;odd<=10;odd++)
			if(odd%2!=0)
				System.out.println(odd);
		System.out.println("----------");
	}
	
	public static void test()
	{
		ArrayList<String> a = new ArrayList<String>(); //Array List 1
		a.add("Violet");
		a.add("Indigo");
		a.add("Blue");
		a.add("Green");
		a.add("Yellow");
		a.add("Orange");
		a.add("Red");
		System.out.println(a);
		for(int i=0;i<a.size();i++)
			System.out.println(a.get(i));
		for(String s: a)
			System.out.print(s);
		System.out.println("");
		a.add(0, "White");
		a.add(6, "Black");
		System.out.println(a); //Array List 2
		System.out.println(a.get(4)); //Array List 3
		a.set(1, "Purple"); //Array List 4
		System.out.println(a);
		a.remove(3); //Array List 5
		System.out.println(a);
		System.out.println(a.indexOf("Black")); //Array List 6
		System.out.println(a.indexOf("Blue"));
		Collections.reverse(a); //Array List 7
		System.out.println(a);
		System.out.println(a.subList(2, 3)); //Array List 8
		System.out.println(a);
		Collections.swap(a, 1, 2); //Array List 9
		System.out.println(a);
		a.removeAll(a); //Array List 10
		System.out.println(a);
		a.trimToSize();
	}
	public static void test1()
	{
		String s = "bob";
		String r = "";
		/*StringBuffer r = new StringBuffer(s);
		r.reverse();
		System.out.println(r);*/
		for(int i=s.length()-1;i>=0;i--)
			r = r+s.charAt(i);
		System.out.println(r);
		if(r.equals(s))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		
		int a = 101;
		int rv=0;
		int rm,temp;
		temp=a;
		while(temp!=0)
		{
			rm = temp%10;
			rv = (rv*10)+rm;
			//rv=rv+rm;
			temp = temp/10;
		}
		System.out.println(rv);
		if(rv==a)
			System.out.println("Palidrome");
		else
			System.out.println("Not Palindrome");
		
		
		
		
		
		
	}
	
	

	public static void ArrayListEx()
	{
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("string");
		ar.add("c");
		ar.add("100");
		ar.add("1.23");
		System.out.println(ar);
		System.out.println(ar.size());
		System.out.println(ar.get(0));
		ar.add("string1");
		System.out.println(ar.size());
		System.out.println(ar);
		ar.remove(0);
		System.out.println(ar);
		System.out.println("----------");
		ArrayList<String> ar1 = (ArrayList<String>)ar.clone();
		System.out.println(ar1);
		ar.remove(3);
		System.out.println(ar1);
		System.out.println(ar);
		ar1.add("test");
		ar.addAll(ar1);
		System.out.println(ar);
		ar.add(1, "penetrated");
		System.out.println(ar);
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("new item1");
		ar2.add("new item2");
		
		ar.addAll(2, ar2);
		System.out.println(ar);
		//ar2.clear();
		System.out.println(ar2);
		System.out.println(ar1.contains("test"));
		System.out.println(ar2.containsAll(ar));
		
		ArrayList<String> ar3 = new ArrayList<String>();
		ar3.add("new item1");
		ar3.add("new item2");
		System.out.println(ar2.equals(ar3));
		System.out.println("----------");
		System.out.println(ar);
		Collections.sort(ar);
		System.out.println(ar);
		for(int i=ar.size()-1;i>=0;i--)
			System.out.println(ar.get(i));
	}
	
	
}
