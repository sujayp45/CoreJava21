package ParameterizedConstructor;

class Car {

    // Instance variables
    String make;
    String model;
    int year;

    // Parameterized constructor
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car information
    void displayCarInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {

        // Creating object
        Car c = new Car("Toyota", "Fortuner", 2024);

        // Calling method
        c.displayCarInfo();
    }
}