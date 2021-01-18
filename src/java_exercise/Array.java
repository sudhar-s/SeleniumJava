package java_exercise;

public class Array
{
	public static void main(String[] args)
	{
		int a[]={10,20,30,40,50};
		int l = a.length;
		
		
		for(int i=0;i<l;i++)
		{		
			int j=i+1;
			if(j<l)
			{
				if((a[j]-a[i])==10)
					System.out.println("Index of 1st no:"+i+" "+"Index of 2nd no:"+j);
			}
			
		}
		
	}

}
