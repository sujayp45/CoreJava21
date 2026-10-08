package AbstractionEg2;

public class UPIPayment extends Payment {

	@Override
	public void makePayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Paid ₹"+amount+ " using UPI");
	}

}