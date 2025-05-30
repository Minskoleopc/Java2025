package Oops;

public class Abstraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountCarmel chanda = new MountCarmel();
		

	}

}

abstract class StudentInfo{
	
	// abstract
	abstract void city();
	
	// non abstract
	public  void Country() {
		System.out.println("India");
	}
	
}

class MountCarmel extends StudentInfo{

	@Override
	void city() {
		// TODO Auto-generated method stub
		System.out.println("Chandrapur");
	}
	
}

class VidyaNiketan extends StudentInfo{

	@Override
	void city() {
		// TODO Auto-generated method stub
		System.out.println("Nagpur");
	}
	
}