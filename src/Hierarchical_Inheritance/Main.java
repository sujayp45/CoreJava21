package Hierarchical_Inheritance;

public class Main {

	public static void main(String[] args) {
		
		Developer d = new Developer();
		d.displayDetails(1, "Sujay", 50000);
		d.writecode("JAVA");
		
		System.out.println();
		
		Manager m = new Manager();
		m.displayDetails(2, "Aman",60000);
		m.conductMeeting(10);

	}

}
