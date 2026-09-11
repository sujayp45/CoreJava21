package WhileLoop;

import java.util.Scanner;

public class WhileLoopEg7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int a = sc.nextInt();
		int i = 1;
		while (i <= 10) {
			System.out.println(a * i);
			i++;
		}
	}

}
