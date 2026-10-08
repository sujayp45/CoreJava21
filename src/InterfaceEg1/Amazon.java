package InterfaceEg1;

public class Amazon implements ECommerce {

	@Override
	public void placeOrder(String item, int quantity) {
		// TODO Auto-generated method stub
		System.out.println("Order placed on Amazon: " + item +" " + quantity);
	}
 
}
