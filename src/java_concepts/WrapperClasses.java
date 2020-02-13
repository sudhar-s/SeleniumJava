package java_concepts;

public class WrapperClasses
{
	public static void main(String[] args)
	{
		String s1 = "20";
		System.out.println(s1+20); //not addition. just string concatenation
		int a = Integer.parseInt(s1);
		System.out.println(a+20); //addition. string converted into integer
		
		String s2 = "125.254";
		System.out.println(s2+10.45); //not addition. just string concatenation
		Double d = Double.parseDouble(s2);
		System.out.println(d+10.45); //addition. string converted into double

		System.out.println(test());
		
		//wrapper classes: Integer, Boolean, Double
		
	}
	
	public static String test()
	{
		String s3 = "true";
		String s4 = "false";
		int i = 3;
		int j = 2;
		if(i>j)
			return s3;
		else
			return s4;
	}

}
