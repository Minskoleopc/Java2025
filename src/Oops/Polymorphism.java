package Oops;

public class Polymorphism {
	// same class , same methodName but different signature,return type may or may not be same

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator add = new Calculator();
		
		add.additionA(13,4);
		add.additionA(13,4,4);
		add.additionA(13,4,4,6);
	}
	
	// compile time static ---> overloading
	// run time (Dynamic) ----> overriding

}

class Calculator {
	
	// overloading
	
	public  void additionA(int a ,int b) {
		System.out.println(a+b);
	}
	public   void additionA(int a ,int b ,int c) {
		System.out.println(a+b+c);
	}
	public   void additionA(int a ,int b ,int c , int d) {
		System.out.println(a+b+c+d);
	}
	
	
}