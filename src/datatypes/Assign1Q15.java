package datatypes;

import java.util.Scanner;

public class Assign1Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("ENTER VALUE OF A: ");
		int a = sc.nextInt();

		System.out.println("ENTER VALUE OF B: ");
		int b = sc.nextInt();

		System.out.println("Sum : " + (a + b));
		System.out.println("Difference : " + (a - b));
		System.out.println("Product : " + (a * b));
		System.out.println("Quotient : " + (a / b));
	}

}
