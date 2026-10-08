package EncapsulationEg2;

public class EncapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee();
		e.setEmpId(1055);
		e.setSalary(60000);
		System.out.println("Employee id: " + e.getEmpId());
		System.out.println("Employee Salary: " + e.getSalary());

	}

}
