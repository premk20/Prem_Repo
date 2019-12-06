package singleInheritance;

class Car {
	
	public void carname() {
		System.out.println("Car name is swift" );
	}
}

 class Bike extends Car{
	
	public void bikename( ) {
		System.out.println("Bike name is pep");
	}
}
 
 public class Vehicle {

	public static void main(String[] args) 
	{
		Bike c = new Bike();
		c.carname();
		c.bikename();
		
	}
	

 }
