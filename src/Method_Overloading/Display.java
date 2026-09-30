package Method_Overloading;

public class Display { // Method Overloading with Different Sequence of Parameters.

	void show(int num, String name) {
		System.out.println("Number: " + num + " , Name: " + name);
	}

	void show(String name, int num) {
		System.out.println("Name: " + name + " , Number: " + num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display obj = new Display();
		obj.show(10, "sujay");
		obj.show("aman", 25);
	}

}
