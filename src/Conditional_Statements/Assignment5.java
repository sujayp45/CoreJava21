package Conditional_Statements;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int A = sc.nextInt();

		System.out.println("Enter Second number: ");
		int B = sc.nextInt();

		if (A > B) {
			System.out.println("Largest Number: " + A);
		} else {
			System.out.println("Largest Number: " + B);
		}

	}
}
