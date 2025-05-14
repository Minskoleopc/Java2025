package coreJava;

public class OOpsDay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//       1st class		
//		Car maruti = new Car();
//		System.out.println(maruti.model);
//		System.out.println(maruti.year);
		
		
		// 2nd class 
		// parametrize constrcutor
//		Car audiA = new Car("audi",2009);
//		Car audiB = new Car("audiB",2019);

		// 3rd class
		
		Person personA = new Person();
		Person personB = new Person(12,"abhisha");
		Person personC = new Person("sarika",34);
		
		personA.display();
		personB.display();
		personC.display();
		

	}

	
}



// default constructor
// constructor should be similar to class name 
//
//class Car {
//	
//		String model;
//		int year ;
//		
//		public Car() {
//			
//			model = "basic";
//			year = 0;
//			
//		}
//		
//		void display() {
//			System.out.println(this.model);
//			System.out.println(this.year);
//		}
//		
//		
//	
//}

// Class with parametrize constructor


//class Car {
//	
//	String model;
//	int year ;
//	
//	public Car(String md ,int yr) {
//		this.model = md;
//		this.year = yr;
//	}
//	
//	
//	public void display() {
//		System.out.println(this.model);
//		System.out.println(this.year);
//	}
//	
//}

// Constructor overloading 

class Person {
	
	String name ;
	int age;
	
	// default constructor
	
	Person(){
		name = "Unknown";
		age = 0;
		
	}
	
	// 1st parametrized constructor
	Person(String nm, int ag){
		name = "Unknown";
		age = 0;
	}
	
	//2nd parametrized constructor
	Person( int ag,String nm){
		name = "Unknown";
		age = 0;
	}
	
	void display() {
		System.out.println(this.name + this.age);
	}
	
	
	
	
	
	
}























