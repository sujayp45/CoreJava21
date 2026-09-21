package Method;

import java.util.Scanner;

public class Rectangle {

	   public static int calculateArea(int l, int w) {
		   System.out.println("length:  "+l+", width: " +w);
		   int area=l*w;
	        return area;
	    }

	    public static void main(String[] args) {
	    	Scanner sc =new Scanner(System.in);
	    	System.out.println("Enter a Value of length and width");
	    	int length=sc.nextInt();
	    	int width=sc.nextInt();
	        int area = Rectangle.calculateArea(length, width);
	        System.out.println("Area of rectangle: " + area);
	    }
	}

	
	
	
	
	
	