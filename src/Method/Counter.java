package Method;

public class Counter {
    static int staticcount=10;
    int nonstaticcount=20;
    
    static void incrementStatic() {
    	int result1 = ++staticcount;
    	System.out.println(result1);
 
    }
      void incrementNonStatic() {
    	  int result2 = ++nonstaticcount;
    	  System.out.println(result2);
    	  
      }
	
	
	
	
	
}
