package Oops;

public class Dog2 extends Animal2 {
	
	String breed;

	public Dog2(String name, int age , String breed) {
		super(name, age);
		this.breed = breed;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Bow bow....");
		
	}
	
	// public method 
	
	public void displayDogInfo() {
		
		System.out.println(this.getName());
		System.out.println(this.breed);
		System.out.println(this.age);
	}
	
	
	
	
}
