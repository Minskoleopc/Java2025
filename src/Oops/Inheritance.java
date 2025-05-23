package Oops;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Single  ----> inheritance access properties and methods of parent on child reference variable
		// Multi-level
		// Hierarchical
		// Multiple
		
		TeacherA amol = new TeacherA("chinmay","deshpande",213,23432423);
		System.out.println(amol.salary);
		amol.displaySalary();
		
		System.out.println(amol.adharCard);
		System.out.println(amol.firstName);
		System.out.println(amol.lastName);
		System.out.println(amol.salary);
		
		amol.displayName();
		amol.displaySalary();
		

		

		
	}

}
class StudentA {
	
	String firstName;
	String lastName;
	int adharCard;
	
	public StudentA(String fn , String ln , int adharCard) {
		this.firstName = fn ;
		this.lastName = ln ;
		this.adharCard = adharCard;
		
	}
	
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
	

}

class TeacherA extends StudentA {
	int salary ;
	
	public TeacherA(String fn, String ln, int adharCard, int sly) {
		super(fn, ln, adharCard);
		this.salary = sly;
	
	}

	
	public void displaySalary() {
		System.out.println(this.salary);
	}
	
	
}





