package ParameterizedConstructor;

class Book {

    // Instance variables
    String title;
    String author;
    double price;

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        // Creating object
        Book b = new Book("Java Programming", "James Gosling", 500);

        // Calling method
        b.displayDetails();
    }
}
