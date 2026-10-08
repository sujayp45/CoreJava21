package Method_Overriding1;

public class MainVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Vehicle obj;
          obj  = new Car();
         obj.speed();
          
          obj = new Bike();
          obj.speed();
                  
	}
}
