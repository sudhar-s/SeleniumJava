package java_concept_inheritance;

public class TestCar {

	
	public static void main(String[] args)
	{
		Car c = new Car();
		//Compile-time/Static Polymorphism: method over loading in different classes by using inheritance
		//Accessing the both methods which are in Parent & Child class by creating an object for child class
		Tata t = new Tata();
		t.brand();  
		t.name();
		t.color();
		t.fueltype();
		t.geartype();
		t.bodytype(); 
		/*c.bodytype();
		c.brand();
		c.color();
		c.fueltype();
		c.geartype();*/
		Car c1 = new Tata(); 
		//Run-time/Dynamic Polymorphism: method overriding
		//Accessing the child class method by creating an object with parent class reference variable
		c1.brand(); 
		c1.bodytype();
		c1.coupe();
		
		c.vehicletype(); //inheriting the super-class/GrandParent class method by using child class object reference
		t.vehicletype(); //inheriting the super-class/GrandParent class method by using Grand child class object reference
		
		System.out.println(t.a); //we can not access the same name variable from the grand-parent
		System.out.println(t.aa);
		
	}

}
