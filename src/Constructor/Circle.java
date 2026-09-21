package Constructor;

class Circle {
    // Non-static variable
    double radius;

    // ConstructorS
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);

        System.out.println("Radius: " + c.radius);
        System.out.println("Area: " + c.calculateArea());
    }
}
