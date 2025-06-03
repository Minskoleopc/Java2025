package Oops;

public class IExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dogA = new Dog();
		dogA.sound();
		Cat catA = new Cat();
		catA.sound();
	}

}

interface Animal {
	void sound();
}

class Dog implements Animal{

	@Override
	public void sound() {
		System.out.println("Bow Bow");
		
	}
	
}

class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("Meow Meow");
		
	}
	
}
