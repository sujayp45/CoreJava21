package Conditional_Statements;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Number");
		int a = sc.nextInt();

		if (a % 2 == 0) {
			System.out.println("a Value is even: " + a);
		} else {
			System.out.println("a Value is odd: " + a);
		}

	}

}
