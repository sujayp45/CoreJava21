package Conditional_Statements;

public class Assignment11 {

	public static void main(String[] args) {

		int num1 = 35;
		int num2 = 25;
		int num3 = 40;

		if (num1 > num2 && num1 > num3) {
			System.out.println("Number 1 is larger: ");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("Number 2 is larger: ");
		} else {
			System.out.println("Number 3 is larger: ");
		}
	}

}
