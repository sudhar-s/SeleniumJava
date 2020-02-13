package java_concepts;

public class StringClassAndMethod
{
	public static void main(String[] args)
	{
		String s1 = "Sample string for test for Java";
		String str1 = "Hello";
		System.out.println(str1);
		
		String str2 = new String("World");
		System.out.println(str2);
		
		String str3 = (str1.concat(str2));
		System.out.println(str3);
		System.out.println("Length: "+str3.length());
		
		//indexOf
		System.out.println("Index of W: "+str3.indexOf('W'));
		System.out.println("Index of o: "+str3.indexOf("o", 5));
		System.out.println("Index of o: "+s1.indexOf("for", 18));
		
		//charAt
		System.out.println("Character at: "+s1.charAt(16));
		
		//replace
		System.out.println("Replaced text: "+s1.replace("s", "ss"));
		System.out.println("Replaced text: "+s1.replace("for", "ff"));
		
		//lowercase
		System.out.println("Lowercase: "+s1.toLowerCase());
		
		//uppercase
		System.out.println("Uppercase: "+s1.toUpperCase());
		
		//compareTo
		String a = "test";
		String b = "stirng";
		System.out.println("Comparison1: "+a.compareTo(b));
		System.out.println("Comparison2: "+b.compareTo(a));
		System.out.println("Comparison3: "+str3.compareToIgnoreCase("for"));
		
		//Trim
		String c = " * trimmed * ";
		System.out.println("Before Trim: "+c);
		System.out.println("After Trim : "+c.trim());
		
		
		
		
	}

}
