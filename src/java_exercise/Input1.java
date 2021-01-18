package java_exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input1
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Integer value:");
		int n = Integer.parseInt(br.readLine());
		System.out.println("Enter the String value:");
		String s = br.readLine();
		System.out.println("Integer value:"+n);
		System.out.println("String value:"+s);
		
		

	}

}
