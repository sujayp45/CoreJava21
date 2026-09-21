package Method;

public class CopyCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Counter.incrementStatic();
        Counter c1= new Counter();
        c1.incrementNonStatic();
        
        
	}

}
