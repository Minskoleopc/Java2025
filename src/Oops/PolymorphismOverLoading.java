package Oops;

public class PolymorphismOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// same class same method name different signature
		Printer printA = new Printer();
		
		printA.printer("story");
		printA.printer(1,"story");
		printA.printer(13.5,"story");
		
		
		

	}

}


class Printer {
	
	void printer (String content) {
		System.out.println("Printing text :" + content);
	}
	
	void printer(int copies , String content) {
		System.out.println("Printing text :" + content );
		System.out.println("Copies to be printed "+copies);
	}
	
	void printer(double size,String content) {
		System.out.println("Printing text :" + content  + "size :"+size);
		
	}
}