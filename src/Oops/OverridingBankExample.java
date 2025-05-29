package Oops;

public class OverridingBankExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBI  sbi = new SBI();
		sbi.loan();
		sbi.save();
	}

}

class WorldBank {
	
	void save() {
		System.out.println("wb save method");
	}
	void loan() {
		System.out.println("wb loan method");
	}
}

class SBI extends WorldBank {
	void save() {
		System.out.println("SBI save method");
		super.save();
	}
	void loan() {
		System.out.println("SBI loan method");
	}
}

class BOB extends WorldBank {
	void save() {
		System.out.println("BOB save method");
	}
	void loan() {
		System.out.println("BOB loan method");
	}
}