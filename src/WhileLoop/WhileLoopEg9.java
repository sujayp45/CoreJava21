package WhileLoop;

public class WhileLoopEg9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;
		while (i <= 100) {
			if (i % 2 == 0) { // sum of even number
				sum = sum + i;
				System.out.println(i);
			}
			i++;
		}
	}

}
