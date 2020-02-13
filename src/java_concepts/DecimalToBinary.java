package java_concepts;

import java.util.Scanner;

public class DecimalToBinary
{

	public static void main(String[] args)
	{
		int decim;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Decimal value: ");
		decim = s.nextInt();
		int i=0;
		int bnum[] = new int[10];
		int val = decim;
		while(val>0)
		{
			bnum[i] = val%2;
			val = val/2;
			i++;
		}
		System.out.println("Binary number for the Decimal "+decim+" is:");
		for(int j=i-1;j>=0;j--)
			System.out.print( +bnum[j]);

	}

}
