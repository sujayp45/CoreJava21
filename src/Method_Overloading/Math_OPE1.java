package Method_Overloading;

public class Math_OPE1 { // Method Overloading with Different Data Types.

	void multiply(int a, int b) {
		System.out.println("Multiply: " + (a * b));
	}

	void multiply(double a, double b) {
		System.out.println("Multiply: " + (a * b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math_OPE1 obj = new Math_OPE1();
		obj.multiply(25, 15);
		obj.multiply(3.10, 5);

	}

}
