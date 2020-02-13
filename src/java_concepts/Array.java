package java_concepts;

public class Array
{
	public static void main(String[] args)
	{
		/*int a[]={10,20,30,40,50};
		int l = a.length;
		
		for(int i=0;i<l;i++)
		{		
			int j=i+1;
			if(j<l)
			{
				if((a[j]-a[i])==10)
					System.out.println("Index of 1st no:"+i+" "+"Index of 2nd no:"+j);
			}
			
		}*/
		
		//Multiple types of Arrays(single dimensional):-
		//Double Array
		double a[] = new double[3];
		a[0]=1.2;
		a[1]=23.45;
		a[2]=6789.0123456;
		System.out.println("Double array:");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		
		//Character Array
		char a1[] = new char[3];
		a1[0]='c';
		a1[1]='5';
		a1[2]='#';
		for(int i=0;i<a1.length;i++)
			System.out.println(a1[i]);
		
		//String Array
		String a2[] = new String[3];
		a2[0]="string arr";
		a2[1]="asdh230947590";
		a2[2]="dfkgh098347)(#$&()*#%";
		for(int i=0;i<a2.length;i++)
			System.out.println(a2[i]);
		
		//Integer Array
		int a3[] = new int[3];
		a3[0]=5628;
		a3[1]=302489;
		a3[2]='d';
		for(int i=0;i<a3.length;i++)
			System.out.println(a3[i]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
