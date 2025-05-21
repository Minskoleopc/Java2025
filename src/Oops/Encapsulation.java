package Oops;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Basic 
		// combining properties and methods in to one unit
		
		Person amol = new Person("chinmay",34);		
		// name and age cannot be accessed outside the class
		//System.out.println(amol.age);
		//System.out.println(amol.name);
		
		amol.displayName();
		String fn = amol.getName();
		System.out.println(fn);
		
		amol.setName("amol R");
		System.out.println(amol);
		
	

	
	}
	
}
// private 

class Person {
	
	//properties
	
	private String name ;
	private int age ;
	
	public Person(String nm , int age) {
		this.name = nm;
		this.age = age;
	}
	
	
	public  void displayName() {
		System.out.println(this.name);
		System.out.println(this.age);
		this.displayCountry();
	}
	
	private void displayCountry() {
		System.out.println("India");
	}
	
	// Getter and Setter methods
	
	public  String getName() {
		return this.name;
	}
	
	public String setName(String fn) {
		 this.name = fn;
		 return this.name;
	}
	
	
	
	
	
	
	
	
	
	
	
	

	
	
}
