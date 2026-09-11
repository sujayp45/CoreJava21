package DoWhile;

public class DoWhileEg9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		int sum = 0;

		do {
			sum = sum + i;
			i = i + 2;
		} while (i <= 100);

		System.out.println("Sum of even numbers = " + sum);
	}

}
