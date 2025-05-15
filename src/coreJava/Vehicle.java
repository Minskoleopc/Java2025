package coreJava;

public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Vehicle2 audi  = new Vehicle2();
//		System.out.println(audi.color);
//		System.out.println(audi.regNo);
//		audi.displayInfo();
//		
//		Vehicle2 bwm = new Vehicle2();
//		System.out.println(bwm.color);
//		System.out.println(bwm.regNo);
//		bwm.displayInfo();
//		
//		bwm.color ="red";
//		bwm.displayInfo();
		
		
//		Vehicle2 audi2 = new Vehicle2("grey","234");
//		Vehicle2 bmw2 = new Vehicle2("red","456");
//		
//		
//		audi2.displayInfo();
//		bmw2.displayInfo();
		
		
		// Default constructor
//		
		
		//Vehicle2 audi3 = new Vehicle2();
		
		
		Vehicle2 audi3 = new Vehicle2(12,"color");
		
		Vehicle2 audi4 = new Vehicle2("red",43);
		
		
		
		
		
		
		
		
		
		
		
//		
	}

}


class Vehicle2 {
	
	String color ;
	int regNo ;
	
	
	// default constructor 
	

//	Vehicle2(){
//		System.out.println("default constructor is called");
//	}
	
	// Parameterized constructor

	Vehicle2(String cl , int rg){
		this.color  = cl;
		this.regNo = rg;
	}
	
	Vehicle2(int rg , String cl){
		this.color  = cl;
		this.regNo = rg;
	}
	
	
	
	
	
	void displayInfo() {
		System.out.println(this.color+this.regNo);
	}
	
	
	
	
}







//class Vehicle2 {
//	
//	// properties 
//	
//	String color = "blue";
//	String regNo = "123";
//
//	
//	void displayInfo() {
//		System.out.println(this.color+this.regNo);
//	}
//	
//	
//	
//}