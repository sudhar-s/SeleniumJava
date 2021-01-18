package oops_concept_inheritance;

public class Car extends Vehicle {

	
	int a=2;
	
	
	public void bodytype()
	{
		System.out.println("Hatchback");
		System.out.println("Sedan");
		System.out.println("SUV");
		System.out.println("Crossback");
		System.out.println("Coupe");
	}
	public void hatchback()
	{
		System.out.println("Small car");
	}
	public void sedan()
	{
		System.out.println("Family car");
	}
	public void SUV()
	{
		System.out.println("Multi terrain car");
	}
	public void crossback()
	{
		System.out.println("Stylish car");
	}
	public void coupe()
	{
		System.out.println("Open type car");
	}
	
	public void brand()
	{
		System.out.println("TATA");
		System.out.println("HYUNDAI");
		System.out.println("MARUTISUZUKI");
		System.out.println("MINI");
	}
	public void tata()
	{
		System.out.println("Tiago - hatchback");
		System.out.println("Tior -  crossback");
		System.out.println("Hexa - SUV");		
	}
	public void hyundai()
	{
		System.out.println("Santro - hatchback");
		System.out.println("i10Active -  crossback");
		System.out.println("Tucsan - SUV");		
	}
	public void fueltype()
	{
		System.out.println("Petrol");
		System.out.println("Diesel");
		System.out.println("Electric");
		System.out.println("Hybrid");
	}
	public void color()
	{
		System.out.println("Red");
		System.out.println("Black");
		System.out.println("White");
		System.out.println("Blue");
	}
	public void geartype()
	{
		System.out.println("Manual");
		System.out.println("Automatic");
		System.out.println("AMT");
	}
	public void parentcm()
	{
		System.out.println("-- Parent class method(Car) --");
	}
	public void gparentcm()
	{
		System.out.println("-- Grand parent method in its child class(Car) --");
	}
}	
