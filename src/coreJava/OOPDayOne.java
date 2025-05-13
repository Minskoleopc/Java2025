package coreJava;

public class OOPDayOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person amol = new Person();
		amol.firstName = "amol";
		System.out.println(amol.firstName);
		amol.displayName();
		
		Person chinmay = new Person();
		chinmay.lastName = "dani";
		chinmay.displayName();
		
		PersonB chinmayB = new PersonB("chinmayB","deshpandeB");
		PersonB sarikaB = new PersonB("sarika","pansare");
		
		sarikaB.displayName();
		chinmayB.displayName();
	}
	
}

class Person {
	
	String firstName ="chinmay";
	String lastName = "deshpande";
	
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
	
}

class PersonB {
	
	String firstName;
	String lastName;
	
	public PersonB(String fn, String ln) {
		this.firstName = fn ;
		this.lastName = ln;
	}
	
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
	
	
	
	
}















