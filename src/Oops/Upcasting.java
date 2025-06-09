package Oops;



public class Upcasting {

	public static void main(String[] args) {
		AnimalC animal;
		animal = new AnimalC();
		animal = new CatC();
		animal = new DogC();
		
		animal.makeSound();
		
		
	}
	
	
	
	
}

class AnimalC {
	
	void makeSound() {
		System.out.println("Some sound");
	}
	
}

class DogC extends AnimalC {
	
	void bark() {
		System.out.println("Bow Bow...");
	}
	
	// override
	void makeSound() {
		System.out.println("Some sound like BOW BOW");
	}
	
	
}

class CatC extends AnimalC {
	void meow() {
		System.out.println("Meow Meow");
	}
}








//Webdriver ---> inteface
//Webdriver driver ;
//driver = new ChromeDriver()
//driver = new Firefoxe()
//only parent methods are called
//child methods cannot be called