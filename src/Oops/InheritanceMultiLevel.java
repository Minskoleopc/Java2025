package Oops;

public class InheritanceMultiLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Son sonOne = new Son("manohar","deshpande","shrish","chinmay");
		
		System.out.println(sonOne.fn);
		System.out.println(sonOne.ln);
		System.out.println(sonOne.fname);
		System.out.println(sonOne.sname);

		sonOne.displayFName();
		sonOne.displayGName();
		sonOne.displaySName();
	}

}

class GrandFather {
		String fn ;
		String ln;
		public GrandFather(String fn, String ln) {
			this.fn = fn ;
			this.ln = ln;
		}
		
		public void displayGName() {
			System.out.println(this.fn + this.ln);
		}
}
class Father extends GrandFather{
	String fname;

	public Father(String fn, String ln,String fname) {
		super(fn, ln);
		this.fname = fname;
	}
	public void displayFName() {
		System.out.println(this.fname + this.ln);
	}
}
class Son extends Father {
	String sname ;

	public Son(String fn, String ln, String fname,String sname) {
		super(fn, ln, fname);
		this.sname = sname;
	
	}
	public void displaySName() {
		System.out.println(this.sname + this.ln);
	}
	
}










