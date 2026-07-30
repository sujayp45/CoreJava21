package Conditional_Statements;

public class Assignment18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 5;

		if (num%5== 0) {
			if (num % 3 == 0) {
				System.out.println("fizzbuzz");
			} else {
				System.out.println("fizz");
			}
		} else {
			System.out.println("buzz");
		}
	}

}
