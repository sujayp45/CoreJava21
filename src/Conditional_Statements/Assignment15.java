package Conditional_Statements;

import java.util.Scanner;

public class Assignment15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Marks: ");
		int Marks = sc.nextInt();

		System.out.println("Enter a Math Score: ");
		int Math = sc.nextInt();

		if (Marks >= 80) {
			if (Math >= 75) {

				System.out.println("Eligible");
			} else {
				System.out.println("Not Eligible beacuse Math score not met");

			}
		} else {
			System.out.println("Not Eligible ");
		}
	}
}
