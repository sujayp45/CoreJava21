package InterfaceEg1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		ECommerce obj_Amazon = new Amazon();
		ECommerce obj_Flipkart = new Flipkart();
		
		obj_Amazon.placeOrder("Headset", 5);
		obj_Flipkart.placeOrder("Mobile", 7);
		
	}

}
