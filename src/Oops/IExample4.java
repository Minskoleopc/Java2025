package Oops;

public class IExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyInfo3 info3 = new MyInfo3();
		info3.methodA();
		info3.methodB();

	}

}


interface A {
	void methodA();
}

interface B extends A {
	void methodB();
}

class MyInfo3 implements B {

	@Override
	public void methodA() {
		System.out.println("method A");
		
	}

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		System.out.println("method B");
	}
	
	
}