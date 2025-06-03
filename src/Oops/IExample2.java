package Oops;

public class IExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Motor motorA = new Motor();
		motorA.fuelType();
		motorA.BrakingSystem();

	}

}

interface vehicleI {
	void fuelType();
}

interface CarI{
	void BrakingSystem();
}

class Motor implements vehicleI,CarI{

	@Override
	public void BrakingSystem() {
		System.out.println("Automatic");
		
	}

	@Override
	public void fuelType() {
		System.out.println("Petrol");
		
	}
	
	
}