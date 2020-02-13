package java_concepts;

public class StringManipulation
{

	public static void main(String[] args)
	{
		String a = "this is a sample string for the program for a test this";
		String a1 = "this is a sample string ";
		String a2 = "this is a sample string for the program for a test this";
		String a3 = "This Is a Sample String For The Program For a Test This";
		String b = "sample_string_this_is";
		String c = "  **    #$%^&* test %^&*9 string    **  ";
		String d = "@10@mm - @10@dd - @2010@YYYY";
		String x = "this string";
		String y = " is joined";
		
		System.out.println("Length of string a is:: "+a.length());
		System.out.println(a.charAt(10));						//char at 11th place
		System.out.println(a.indexOf('s'));						//1st occurrence of 's'
		System.out.println(a.indexOf('s', 4)); 					//2nd occurrence of 's' (hard coded value)
		System.out.println(a.indexOf('s', a.indexOf('s')+1)); 	//2nd occurrence of 's' (non-hard coded value)
		System.out.println(a.indexOf('s', 7)); 					//3rd occurrence of 's' (hard coded value)
		int l = a.indexOf('s', a.indexOf('s')+1);
		System.out.println(a.indexOf('s', l+1)); 				//3rd occurrence of 's' (non-hard coded value)
		System.out.println(a.indexOf("program")); 				//occurrence of a string inside a string
		System.out.println(a.indexOf("this", 4)); 				//getting index for the occurrence of a string inside a string
		System.out.println(a.indexOf('z'));    					//check o/p for non exist char in a string
		System.out.println(a.indexOf("code")); 					//check o/p for non exist string inside a string
		System.out.println(a.equals(a1)); 						//comparing string (different strings)
		System.out.println(a.equals(a2)); 						//comparing string (same strings)
		System.out.println(a.equalsIgnoreCase(a3)); 			//comparing string (same string with case difference)
		System.out.println(b.substring(6)); 					//substring from an index value
		System.out.println(b.substring(6, 14)); 				//substring between two index values
		System.out.println(b.subSequence(6, 14)); 				//same like substring between two index values
		System.out.println(c.trim()); 							//trim a string (clear spaces before and after the string)
		System.out.println(c.replace(" ", "O")); 				//replace a char
		System.out.println(d.replace("-", "/")); 				//replace a char
		System.out.println(d.replaceAll("[^ 0-9]", "")); 		//replace char by using regular expression
		String bval[] = b.split("_"); 							//split string and save it to an array and print it
		for(int i=0;i<bval.length;i++)
			System.out.println(bval[i]);
		System.out.println(x.concat(y));
		
		
	}

}
