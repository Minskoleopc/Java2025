package Oops;

public class HerarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// can i create object of mother -- create 
		// can i crate object of son - yes
		
		Son2 chinmay = new Son2("kanchan","deshpande","chinmay");
		Daughter gauri = new Daughter("kanchan","deshpande","gauri");
	}

}
// Parent class
class Mother {
	String fn;
	String ln;
	protected int mobileNumber = 212; 
	
	public Mother(String firstName , String lastName) {
		this.fn = firstName ;
		this.ln = lastName;
	}
	
	public void displayName() {
		System.out.println(this.fn + this.ln);
	}
	
}
// Child class one 

class Daughter extends Mother{
	String dname;

	public Daughter(String firstName, String lastName ,String dname) {
		super(firstName, lastName);
		this.dname = dname;
		// TODO Auto-generated constructor stub
		
	}
	public void displayDName() {
		System.out.println(this.dname + this.ln);
		System.out.println(this.mobileNumber);
	}
	
}

// Child class two

class Son2 extends Mother{
	String sname;

	public Son2(String firstName, String lastName ,String sname) {
		super(firstName, lastName);
		this.sname = sname;
		// TODO Auto-generated constructor stub
		
	}
	public void displaySName() {
		System.out.println(this.sname + this.ln);
		System.out.println(this.mobileNumber);
	}

	
}




















