package EncapsulationEg1;

public class Student {

	private String name;// Private variable (data hiding)

	private int age;// Private variable (data hiding)

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;

	}

	public void setAge(int a) {
		age = a;
	}

	public int getAge() {
		return age;
	}

}
