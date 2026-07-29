package Conditional_Statements;

import java.util.Scanner;

public class Assignment13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number: ");
		int num = sc.nextInt();

		if (num > 0 && num % 2 > 0) {
			System.out.println("Number is positive and even: ");
		}

		else {
			System.out.println("Number is not positive and even:");
		}
	}
}
