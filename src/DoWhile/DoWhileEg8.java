package DoWhile;

public class DoWhileEg8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;

		do {
			sum = sum + i;
			i = i + 2;
		} while (i <= 100);

		System.out.println("Sum of odd numbers = " + sum);
	}

}
