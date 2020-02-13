package java_exercise;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInArrayInt
{

	public static void main(String[] args)
	{
		int a[] = {2,8,1,10,9,10};
		
		
		//1. Compare each elements: O(n*n) method
		for(int i=0;i<a.length;i++)
		{			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					System.out.println("Duplicate value: "+a[i]);
			}
		}
		
		//2. Using Hashset
		Set<Integer> s = new HashSet<Integer>();
		for(int n : a)
		{
			if(s.add(n)==false)
				System.out.println("Duplicate value is: "+n);
		}

	}

}
