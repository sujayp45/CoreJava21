package ForLoop;

import java.util.Scanner;

public class ForLoopEg11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;

			}
		}
		if (count == 2)
			System.out.println(num + "is a prime number");
		else
			System.out.println(num + "is not a prime number");
	}

}
