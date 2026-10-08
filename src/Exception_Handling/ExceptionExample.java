package Exception_Handling;

public class ExceptionExample {
	public static void main(String[] args) {
		try {
			int result = 10 / 0; // Division by zero (will throw exception)
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("Error: Cannot divide by zero!");
		}
	}
}
