package java_exercise;




public class Test
{
	public static void main(String args[])
	{
		
		int i,j;
		
		for(i=1;i<=5;i++)
		{
			for(j=i;j<=5;j++)
			{
				System.out.print(i);
			}
			System.out.println("");
		}
		
		for(i=5;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println("");
		}
		
		for(i=5;i>=1;i--)
		{
			for(j=i;j<=5;j++)
			{
				System.out.print(i);
			}
			System.out.println("");
		}
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println("");
		}
		
		for(i=1;i<=5;i++)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" "+i);
			}
			System.out.println("");
		}
		
		for(i=5;i>=1;i--)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" "+i);
			}
			System.out.println("");
		}
		
		for(i=5;i>=1;i--)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print(" "+i);
			}
			System.out.println("");
		}
	}
	

}
