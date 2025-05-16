package Oops;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car audi = new Car();
		Car bmw = new Car();
		System.out.println(audi.brand);
		System.out.println(audi.year);
		audi.drive();
		
		audi.year = 2000;
		audi.brand = "A6";
		audi.displayYear();
		bmw.displayYear();
		
		
	}
	
	

}

class Car{
	
	// attribute / Property
	
	String brand;
	int year ;
	
	void drive(){
		System.out.println("Driving ....");
	}
	
	void displayYear() {
		System.out.println(this.year);
	}
	
}
