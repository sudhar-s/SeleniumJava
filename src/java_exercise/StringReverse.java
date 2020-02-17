package java_exercise;

public class StringReverse
{

	public static void main(String[] args)
	{
		
		//Using for loop
		
		String s = "sample text";
		String rev = "";
		
		System.out.println(s.length());
		for(int i=s.length()-1;i>=0;i--)
		{
			rev= rev + s.charAt(i);
		}
		System.out.println("Reverse by for loop:");
		System.out.println(rev);
		
		//Using StringBuffer class
		
		StringBuffer sb = new StringBuffer(s);
		System.out.println("Reverse by String buffer:");
		System.out.println(sb.reverse());
		
				
		
		
		
	}

}
