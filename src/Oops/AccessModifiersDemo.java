package Oops;

abstract class Animal2 {
	
	// private field
	
	private  String name;
	
	// protected field - allowed in sub classes
	protected int age ;
	
	// constuctor
	public Animal2(String name , int age ) {
		this.name = name;
		this.age = age ;
	}
	
	// methods 
	
	public String getName() {
		return this.name ;
	}
	
	public abstract void makeSound();
	
	
	
	
	
}