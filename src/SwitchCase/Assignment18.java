package SwitchCase;

import java.util.Scanner;

public class Assignment18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Alphabet A to Z: ");

		char Alphabet = sc.next().charAt(0);

		switch (Alphabet) {

		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':

			System.out.println("Vowel");
			break;

		default:
			System.out.println("Consonant");

		}

	}

}
