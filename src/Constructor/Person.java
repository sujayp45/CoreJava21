package Constructor;

class Person {

    // Instance variables
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to greet
    void greet() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    public static void main(String[] args) {

        // Creating object
        Person p = new Person("Rahul", 25);

        // Calling method
        p.greet();
    }
}
