package Oops;

public class DownCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		AnimalE animale = new DogE();
//		DogE dog = (DogE) animale;
//		dog.bark();
//		
		
		
		//not possible
		// this is not possible
		
//		AnimalE animale = new AnimalE();
//		DogE dog = (DogE) animale;
//		dog.bark();
		

	}

}

class AnimalE {

	void makeSound() {
		System.out.println("nmake some sound");
	}

}

class DogE extends AnimalE {

	void bark() {
		System.out.println("Bow Bow.....");
	}
}