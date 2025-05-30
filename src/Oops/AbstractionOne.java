package Oops;

public class AbstractionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// abstraction  - rule implementation / function definition
		// Abstract method - no body only define and signature
		// Abstract class can have abstract method and normal method
		// We cannot create instance object of abstract class 

		// Creating object of abstract class
		//Vehicle v = new Vehicle();
		
		CarC c = new CarC();
		c.Color();
		c.fuelType();
		
	}

}

// This class is abstract class
abstract class Vehicle {
	// abstract method (no body)
	abstract void  fuelType();
	
	
}

class CarC extends Vehicle{

	@Override
	void fuelType() {
		// TODO Auto-generated method stub
		System.out.println("Electric ev..");
	}
	
	void Color() {
		System.out.println("Green");
	}
	
	
}


class Bike extends Vehicle {

	@Override
	void fuelType() {
		// TODO Auto-generated method stub
		System.out.println("petrol");
	}
	
	void Color() {
		// TODO Auto-generated method stub
		System.out.println("black");
	}
	
}













