package java_concepts;

public class TwoDimensionalArray
{
	public static void main(String[] args)
	{
		String a[][] = new String[2][3];
		System.out.println("Total no of Rows: "+a.length); //Total no of rows
		System.out.println("Total no of Columns: "+a[0].length); //Total no of columns
		System.out.println("Total no of Columns: "+a[1].length); //Total no of columns
		
		a[0][0] = "1st cell - Row[1]Col[1]";
		a[0][1] = "2nd cell - Row[1]Col[2]";
		a[0][2] = "3rd cell - Row[1]Col[3]";
		
		a[1][0] = "1st cell - Row[2]Col[1]";
		a[1][1] = "2nd cell - Row[2]Col[2]";
		a[1][2] = "3rd cell - Row[2]Col[3]";
		
		//System.out.println(a[1][2]);
		System.out.println("Array values:");
		for(int row=0;row<a.length;row++)
		{
			for(int col=0;col<a[0].length;col++)
			{
				System.out.println(a[row][col]);
			}
		}
		
		
	}
	
	

}
