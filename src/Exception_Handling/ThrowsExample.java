package Exception_Handling;

import java.io.*;

public class ThrowsExample {
    static void readFile() throws IOException {
        FileReader file = new FileReader("nonexistent.txt"); // File not found
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File not found!");
        }
    }
}
