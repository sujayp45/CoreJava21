package InterfaceEg2;

public class Car implements Vehicle, Fuel {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Car is starting with key ignition");
	}

	@Override
	public void refuel(int liters) {
		// TODO Auto-generated method stub
		System.out.println("Bike refueled with: "+liters+"Ltr");
	}

}
