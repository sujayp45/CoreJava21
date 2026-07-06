package datatypes;

import java.util.Scanner;

public class Assign1Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your full Name: ");
		String name = sc.next();
		System.out.println("Enter Your Course Name: ");
		String CourseName = sc.next();
		System.out.println("Enter Your Age: ");
		int age = sc.nextInt();
		System.out.println("My name is " + name + ".My course name is " + CourseName + ".my age is " + age+".");

	}
}
