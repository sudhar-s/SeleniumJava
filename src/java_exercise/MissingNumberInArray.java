package java_exercise;

public class MissingNumberInArray
{

	public static void main(String[] args)
	{
		int a[] = {-1,0,1,2,3,4,6,7,8,9,10};
		int sum = 0;
		int sum1 = 0;
		for(int i=0;i<a.length;i++)
			sum = sum + a[i];
		System.out.println("Sum of given array values: "+sum);
		
		for(int j=-1;j<=10;j++)
			sum1 = sum1 + j;
		System.out.println("Sum of orig Array values: "+sum1);
		
		if(sum != sum1)
			System.out.println("** Missing value in the Array is: "+(sum1-sum));
		else
			System.out.println("** There is no missing value in the Array **");

	}

}
