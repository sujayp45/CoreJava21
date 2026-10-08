package InterfaceEg4;

public class SBI implements Bank {

	@Override
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Amount deposite:- "+ amount+"rs");
	}

	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Amount withdraw:- "+ amount+"rs");
	}

}
