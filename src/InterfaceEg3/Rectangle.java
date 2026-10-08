package InterfaceEg3;

class Rectangle implements Shape {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        double result = length * breadth;
        System.out.println("Area of Rectangle = " + result);
    }
}
