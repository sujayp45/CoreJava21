package Conditional_Statements;

import java.util.Scanner;

public class Assignment16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter age: ");
		int age = sc.nextInt();

		System.out.println("Membership (true/false): ");
		boolean membership = sc.nextBoolean();

		if (age >= 18) {

			if (membership == true) {
				System.out.println("Entry Allowed");
			} else {
				System.out.println("Entry Denied due to not have membership");
			}
		} else {
			System.out.println("Entry Denied");
		}
	}

}
