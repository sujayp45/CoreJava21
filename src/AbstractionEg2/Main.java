package AbstractionEg2;

public class Main {
	public static void main(String[] args) {

		Payment obj_creditCard = new CreditCardPayment();
		Payment obj_upi = new UPIPayment();

		obj_creditCard.makePayment(1555.50);
		obj_upi.makePayment(5000.50);
	}
}