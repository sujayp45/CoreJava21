package SwitchCase;

import java.util.Scanner;

public class Assignment19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a 1st number: ");
		int num = sc.nextInt();

		System.out.println("Enter a 2nd Number: ");
		int num1 = sc.nextInt();

		System.out.println("Enter operator(`+, -, *, /`): ");
		char op = sc.next().charAt(0);

		switch (op) {

		case '+':
			System.out.println("Result:-  " + (num + num1));
			break;

		case '-':
			System.out.println("Result:- " + (num - num1));
			break;

		case '*':
			System.out.println("Result:- " + (num * num1));
			break;

		case '/':
			System.out.println("Result:- " + (num / num1));
			break;

		default:
			System.out.println("invalid operator");

		}
	}

}
