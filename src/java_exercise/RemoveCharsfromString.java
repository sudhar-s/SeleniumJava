package java_exercise;

public class RemoveCharsfromString {

	public static void main(String[] args)
	{
		String s = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ 1597324860 `~!@#$%^&*()_+[]{};':|,./<>?";
		String ss = "abcd*efgh#ijkl*mnop#qrst*uvwx#yz*";
		System.out.println("Given String: ["+s+"]");
		String s1 = s.replaceAll("[^A-Za-z]", ""); //Remove all chars except A_Z & a-z
		System.out.println(s1);
		String s2 = s.replaceAll("[^0-9]", "");   //Remove all chars except 0-9
		System.out.println(s2);
		String s3 = ss.replaceAll("[*]", "");   //Remove all *
		System.out.println(s3);
		String s4 = ss.replaceAll("[#]", "");   //Remove all #
		System.out.println(s4);
		
	}

}
