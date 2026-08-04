package SwitchCase;

import java.util.Scanner;

public class Assignment17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number From 1 to 7");
		int Day = sc.nextInt();

		switch (Day) {

		case 1:
			System.out.println("Mon");
			break;

		case 2:
			System.out.println("tues");
			break;

		case 3:
			System.out.println("wed");
			break;

		case 4:
			System.out.println("thurs");
			break;

		case 5:
			System.out.println("fri");
			break;

		case 6:
			System.out.println("sat");
			break;

		case 7:
			System.out.println("sun");
			break;

		default:
			System.out.println("Invalid Number");

		}
	}

}