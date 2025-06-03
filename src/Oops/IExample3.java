package Oops;

public class IExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TeacherInfo teacher = new TeacherInfo("chinmay","deshpande",1000);
		
		teacher.cityName();
		teacher.countryName();
		teacher.displayName();
		teacher.address();
		
		
	}

}


class StudentInfo2 {
	
	String fn ;
	String ln ;
	
	public StudentInfo2(String fn , String ln) {
		this.fn = fn ;
		this.ln = ln;
	}
	

	public void displayName() {
		System.out.println(this.fn+ this.ln);
	}
	
}


interface countryInfo{
	void countryName();
	void cityName();
	void address();
}


class TeacherInfo extends StudentInfo2 implements countryInfo{
	int salary ;

	public TeacherInfo(String fn, String ln,int sl) {
		super(fn, ln);
		this.salary  = sl;
		
	}

	@Override
	public void countryName() {
		// TODO Auto-generated method stub
		System.out.println("india");
		
	}

	@Override
	public void cityName() {
		// TODO Auto-generated method stub
		System.out.println("pune");
	}

	@Override
	public void address() {
		// TODO Auto-generated method stub
		System.out.println("411028");
	}
	
}













