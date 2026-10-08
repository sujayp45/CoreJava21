package Encapsulation;

public class Main {
	public static void main(String[] args) {
		Person p = new Person(); // Creating object
		p.setName("John Doe"); // Setting value using setter
		System.out.println("Name: " + p.getName()); // Accessing value using getter
	}
}
