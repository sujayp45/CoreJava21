package Method_Overloading;

public class Calculator {

	void add(int a, int b) { // Returns the sum of two integers
		System.out.println("Sum " + (a + b));

	}

	void add(double a, double b) { // Returns the sum of two double values.
		System.out.println("Sum: " + (a + b));

	}

	void add(int a, int b, int c) { // Returns the sum of three integers
		System.out.println("Sum: " + (a + b + c));

	}

	void add(String a, String b) { // Concatenates two strings and returns the result
		System.out.println("Sum: " + (a + b));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator obj = new Calculator();
		obj.add(10, 20);
		obj.add(2.5, 55.20);
		obj.add(20, 45, 50);
		obj.add("Sujay", " " + "Aman");
	}

}
