package Oops;

public class PolymorphismOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreditCard cc = new CreditCard();
		cc.makePayment();
		
		PayPal pp = new PayPal();
		pp.makePayment();
		
		
		
	}
	
	
	

}

// UK --- > card ----> swipe   ------- calculation
// India ---> card ---> swipe 


class Payment {
	
	void makePayment() {
		System.out.println("Making generic payment...");
	}
	
}

class CreditCard extends Payment{
	
	// same method name , same signature but different class
	// overriding
	
	void makePayment() {
		System.out.println("Making genric payment from credit card");
	}
	
	
}

class PayPal extends Payment {
	
	void makePayment() {
		System.out.println("Making genric payment from paypal system");
	}
	
}







