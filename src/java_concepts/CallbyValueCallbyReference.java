package java_concepts;

public class CallbyValueCallbyReference
{
	int p,q;
	public static void main(String[] args)
	{
		int x = 11;
		int y = 22;
		CallbyValueCallbyReference obj = new CallbyValueCallbyReference();
		System.out.println("Sum of a, b :"+obj.sum(x, y)); //Call by value
		
		obj.p = 15;
		obj.q = 25;
		System.out.println("Before swap:");
		System.out.println(obj.p);
		System.out.println(obj.q);
		obj.swap(obj);
		System.out.println("After swap:");
		System.out.println(obj.p);
		System.out.println(obj.q);
	}
	
	public int sum(int a, int b)
	{
		a = 10;
		b = 20;
		int c = a+b;
		return c;
	}
	
	//Call by Reference
	public void swap(CallbyValueCallbyReference t)
	{
		int temp;   
		temp = t.p; //temp = 15
		t.p	 = t.q; //t.p  = 25
		t.q  = temp;//t.q  = 15
	}

}
