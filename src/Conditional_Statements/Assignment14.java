package Conditional_Statements;

import java.util.Scanner;

public class Assignment14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int num = sc.nextInt();

		if (num > 0) {

			if (num % 2 == 0) {
				System.out.println("positive and even number");
			} else {
				System.out.println("positive and odd number");

			}
		} else
			System.out.println("not a positive number");

	}

}
