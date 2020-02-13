package java_exercise;

import java.util.Arrays;

public class LargestSmallestNumberInArray
{
	
	public static void main(String[] args)
	{
		int a[] = {-1,0,10,2,33,4,50};
		int large = a[0];
		int small = a[0];
			
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>large)
				large = a[i];
			if(a[i]<small)
				small = a[i];
		}
		System.out.println("Given Array is: "+Arrays.toString(a));
		System.out.println("Largest Number in the Array is: "+large);
		System.out.println("Smallest Number in the Array is: "+small);

	}

}
