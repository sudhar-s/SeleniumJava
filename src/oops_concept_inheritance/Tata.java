package oops_concept_inheritance;

public class Tata extends Car { 
	
		
	public void brand()
	{
		System.out.println("TATA");
				
	}
	public void name()
	{
		System.out.println("TIGOR");
		
	}
	public void bodytype()
	{
		System.out.println("Crossback");
		
	}
	public void fueltype()
	{
		System.out.println("Petrol");
		
	}
	public void color()
	{
		System.out.println("Chrome");
		
	}
	public void geartype()
	{
		System.out.println("Manual");
		
	}
	
	public void parentcm()
	{
		System.out.println("-- Parent class method in Child class(Tata) --");
	}
	public void gparentcm()
	{
		System.out.println("-- Grand parent method in its grand child class(Tata) --");
	}
	public void childcm()
	{
		System.out.println("-- Child class method(Tata) --");
	}
	
}
