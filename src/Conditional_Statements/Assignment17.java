package Conditional_Statements;

import java.util.Scanner;

public class Assignment17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a username: ");
		String username = sc.next();

		System.out.println("Enter a Password: ");
		String password = sc.next();

		if (username.equals("admin") ) {
			
			if (password.equals("1234")) {
				System.out.println("Login Successful");
			
			} else {
				System.out.println("Login Unsuccessful");
			}
		
		} else {

			System.out.println("Invalid Credentials");
		}

	}

}
