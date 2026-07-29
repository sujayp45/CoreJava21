package Conditional_Statements;

import java.util.Scanner;

public class Assignment10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter value: ");
		int temperature = sc.nextInt();

		if (temperature >= 30) {
			System.out.println("levels: Hot");
		}

		else if (temperature >= 20) {
			System.out.println("levels: Warm");

		} else if (temperature >= 10) {
			System.out.println("levels: Cold");

		} else {
			System.out.println("Very Cold");
		}
	}

}
