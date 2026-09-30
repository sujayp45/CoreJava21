package Method_Overloading;

public class Printer {

	void printValue(int num) { // Prints an integer value.
		System.out.println("Number: " + num);

	}

	void printValue(double num) { // Prints a double value.
		System.out.println("double: " + num);

	}

	void printValue(String text) { // Prints a string value.
		System.out.println("String: " + text);

	}

	void printValue(boolean flag) { // Prints a boolean value.
		System.out.println("Boolean: " + flag);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printer obj = new Printer();
		obj.printValue(25);
		obj.printValue(25.5);
		obj.printValue("Sujay");
		obj.printValue(true);
	}

}
