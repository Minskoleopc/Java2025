package Oops;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car2 audi = new Car2("audi",35);
		Car2 bmw = new Car2("bwm",45);
		
		audi.displayYear();
		bmw.drive();
	}
	
	

}

class Car2 {
	
	String brand;
	int year;
	
	// constructor
	// constructor will not have return type 
	public Car2(String brd , int yr) {
		this.brand = brd;
		this.year = yr;
		
	}
	
	void drive(){
		System.out.println("Driving ....");
	}
	
	void displayYear() {
		System.out.println(this.year);
	}
	
	
	
}


