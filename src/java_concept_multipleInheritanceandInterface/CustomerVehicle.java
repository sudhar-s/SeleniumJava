package java_concept_multipleInheritanceandInterface;

public class CustomerVehicle implements Interface_Car, Interface_Bus { //Achieving Multiple Inheritance (Is a relationship)

	//--  Car Interface methods --
	public void brand()
	{
		System.out.println("Car Interface :: HYUNDAI");
	}
	public void model()
	{
		System.out.println("Car Interface :: Santro");
	}
	public void color()
	{
		System.out.println("Car Interface :: Grey");
	}
	
	//-- Bus Interface methods --
	public void company()
	{
		System.out.println("Bus Interface :: VOLVO");
	}
	public void price()
	{
		System.out.println("Bus Interface :: 4500000");
	}
	
	//-- Own methods of CustomerVehicle --
	public void choice()
	{
		System.out.println("Implemented class :: Car");
	}
	public void budget()
	{
		System.out.println("Implemented class :: 3000000");
	}
}
