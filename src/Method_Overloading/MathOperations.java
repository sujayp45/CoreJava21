package Method_Overloading;

public class MathOperations { // Method Overloading with Different Number of Parameters

	void add(int a, int b) {
		System.out.println("Sum of Number: " + (a + b));
	}

	void add(int a, int b, int c) {
		System.out.println("Sum of Number: " + (a + b + c));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperations obj = new MathOperations();
		obj.add(10, 50);
		obj.add(25, 30, 45);
	}

}
