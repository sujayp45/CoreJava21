package Method;

public class MathOperation {

	static void multiplyNumbers(int a, int b) {
		System.out.println("Multiply number = "+ a*b);
	}
	void addNumbers(int c, int d) {
		System.out.println("Sum = " + (c+d));
	}
	
	public static void main(String[] args) {
		multiplyNumbers(10,20);
		
		MathOperation m1 = new MathOperation();
		m1.addNumbers(10,20);
  
	}

}
