package InterfaceEg1;

public class Flipkart implements ECommerce {

	@Override
	public void placeOrder(String item, int quantity) {
		// TODO Auto-generated method stub
		 System.out.println("Order placed on Flipkart: "+ item +" " + quantity);
	}

}
