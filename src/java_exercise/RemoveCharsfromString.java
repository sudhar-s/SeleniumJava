package java_exercise;

public class RemoveCharsfromString {

	public static void main(String[] args)
	{
		String s = "234 jkh dfg 34d gj jkh)(*#%(*";
		String s1 = s.replaceAll("[^A-Za-z]", "");
		System.out.println(s1);
		

		
	}

}
