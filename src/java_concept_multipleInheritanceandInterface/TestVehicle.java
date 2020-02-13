package java_concept_multipleInheritanceandInterface;

public class TestVehicle 
{
	public static void main(String[] args)
	{
		System.out.println("Price of car: "+Interface_Car.value);
		System.out.println("Mileage of Bus: "+Interface_Bus.mileage);
		//Interface_Car.value = 300000; //we cannot change the value of Interface
		//Interface_Bus.mileage = 20;    //we cannot change the value of Interface
		//Interface_Car c = new Interface_Car();  //we cannot create the object for Interface
		//Interface_Bus b = new Interface_Bus();  //we cannot create the object for Interface
		CustomerVehicle c =  new CustomerVehicle();
		c.brand();
		c.model();
		c.color();
		c.company();
		c.price();
		c.choice();
		c.budget();		
		
		Interface_Bus b = new CustomerVehicle();
		b.company(); //Only overridden methods only can be called
		b.price();
		System.out.println("Bus Interface variable: "+b.mileage);
		System.out.println("Bus Interface variable: "+Interface_Bus.mileage); //The warning from above line will be cleared if we define like this
		
		Interface_Car c1 = new CustomerVehicle();
		c1.brand();
		c1.color();
		c1.model();
		System.out.println("Car Interface variable: "+c1.value);
		System.out.println("Car Interface variable: "+Interface_Car.value); //The warning from above line will be cleared if we define like this
		
		
		
		
		
		

	}
	
}
