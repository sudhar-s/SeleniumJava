package java_exercise;

public class IntegerReverse
{

	public static void main(String[] args)
	{
		int n = 1234567890;
		String r = "";
		int t;
		while(n!=0)
		{
			t = n%10;
			r = r + t;
			n = n/10;
			/*if(r==0)
				System.out.print("0");*/
			
		}
		//System.out.println(r);
		
			
		

	}

}
