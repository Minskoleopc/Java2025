package Oops;

public class Encapsulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student fn = new Student("1235555");
	
	}
	
}

class Student {
	private final String rollNumber;
	private String name;
	
	public Student(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	
//	public void setRollNumber(String rollNumber) {
//		this.rollNumber = rollNumber;
//	}
	
	
}
